
package net.tofikarz.toffiumforge.item;

import net.tofikarz.toffiumforge.procedures.FioletowejablkoFoodEatenProcedure;
import net.tofikarz.toffiumforge.ToffiumforgeModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ToffiumforgeModElements.ModElement.Tag
public class FioletowejablkoItem extends ToffiumforgeModElements.ModElement {
	@ObjectHolder("toffiumforge:fioletowejablko")
	public static final Item block = null;
	public FioletowejablkoItem(ToffiumforgeModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(10).saturation(1.5f).setAlwaysEdible().build()));
			setRegistryName("fioletowejablko");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Dodaje ci efekt widzenia w ciemno\u015Bci i przywraca po\u0142owe paska jedzenia"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				FioletowejablkoFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}

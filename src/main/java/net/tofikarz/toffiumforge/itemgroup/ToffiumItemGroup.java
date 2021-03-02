
package net.tofikarz.toffiumforge.itemgroup;

import net.tofikarz.toffiumforge.block.TrocinyBlock;
import net.tofikarz.toffiumforge.ToffiumforgeModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ToffiumforgeModElements.ModElement.Tag
public class ToffiumItemGroup extends ToffiumforgeModElements.ModElement {
	public ToffiumItemGroup(ToffiumforgeModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtoffium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TrocinyBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}

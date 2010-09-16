package uk.co.gavd.android.multigotchi.pets.dragon;

import uk.co.gavd.android.multigotchi.collections.IMultiKeyCollectable;
import uk.co.gavd.android.multigotchi.collections.ItemNotFoundException;
import uk.co.gavd.android.multigotchi.pets.Behaviour;
import uk.co.gavd.android.multigotchi.pets.Pet;

/**
 * Behaviour for a dragon that uses fire and energy to gather gold
 * 
 * @author Gavin Davies
 */
public class BehaviourPillage extends Behaviour implements IMultiKeyCollectable {

	/**
	 * Create a behaviour with a reference to a pet
	 * 
	 * @param pet Reference to the pet that this behaviour is for
	 */
	public BehaviourPillage(Pet pet) {
		super(pet);
	}

	@Override
	public void execute() throws ItemNotFoundException {
		this.pet.getAttribute(Dragon.ATTRIBUTE_FIRE).decrement(10);
		this.pet.getAttribute(Dragon.ATTRIBUTE_GOLD).increment(10);
		this.pet.getAttribute(Dragon.ATTRIBUTE_ENERGY).decrement(10);
	}

	public String getName() {
		return "Pillage";
	}
}

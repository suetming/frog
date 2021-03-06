/*
 * Copyright 2018 the original author or authors. 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.github.drinkjava2.frog.brain.organ;

import com.github.drinkjava2.frog.Frog;
import com.github.drinkjava2.frog.brain.Organ;

/**
 * Move down frog 1 unit if outputs of nerve cells active in this zone
 */
public class RFootMoveDown extends Organ {
	private static final long serialVersionUID = 1L;

	@Override
	public void active(Frog f) {
		if (f.rFootPos <= -5)
			return;
		if (activedByCells(f)) {
			actived = true;
			f.rFootPos--;
			if (f.bFootStatus == "UP" && f.rFootStatus == "DOWN")
				f.y++;
		} else
			actived = false;
	}

}

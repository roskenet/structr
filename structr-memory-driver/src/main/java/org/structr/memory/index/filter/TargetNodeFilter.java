/*
 * Copyright (C) 2010-2025 Structr GmbH
 *
 * This file is part of Structr <http://structr.org>.
 *
 * Structr is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Structr is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Structr.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.structr.memory.index.filter;

import org.structr.memory.MemoryEntity;
import org.structr.memory.MemoryIdentity;

/**
 */
public class TargetNodeFilter<T extends MemoryEntity> implements Filter<T> {

	private MemoryIdentity targetNode = null;

	public TargetNodeFilter(final MemoryIdentity targetNode) {
		this.targetNode = targetNode;
	}

	public MemoryIdentity getIdentity() {
		return targetNode;
	}
}

/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.jpa.criteria;
import javax.persistence.criteria.Path;

import org.hibernate.jpa.criteria.compile.RenderingContext;

/**
 * Implementation contract for things which can be the source (parent, left-hand-side, etc) of a path
 *
 * @author Steve Ebersole
 */
public interface PathSource<X> extends Path<X> {
	public void prepareAlias(RenderingContext renderingContext);

	/**
	 * Get the string representation of this path as a navigation from one of the
	 * queries <tt>identification variables</tt>
	 *
	 * @return The path's identifier.
	 */
	public String getPathIdentifier();
}

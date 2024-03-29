/*
 *  Chess383ExceptionTest.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2020 Jörg Dippel
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package chess383.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * The class Chess383ExceptionTest implements an upper tester
 * </p>
 *
 * @author    Jörg Dippel
 * @version   April 2022
 *
 */
@DisplayName("If an exception is thrown then the exception is the correct instance with related message")
public class Chess383ExceptionTest {
    
    @Test
    @DisplayName("throwing a chess exception")
    public void throwingAChessException() {
        
        assertThatThrownBy(() -> { foo(); })
                .isExactlyInstanceOf( Chess383Exception.class )
                .hasMessageContainingAll( "error message" );
    }
    
    private static void foo() {
        
        throw Chess383Exception.create( "this is an error message" );
    }
}

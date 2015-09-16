/*
 * SonarQube PHP Plugin
 * Copyright (C) 2010 SonarSource and Akram Ben Aissi
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.php.parser.statement;

import org.junit.Before;
import org.junit.Test;
import org.sonar.php.parser.PHPGrammar;
import org.sonar.php.parser.RuleTest;

public class StatementTest extends RuleTest {

  @Before
  public void setUp() {
    setTestedRule(PHPGrammar.STATEMENT);
  }

  @Test
  public void test() {
    matches("{}");
    matches("label:");
    matches("if ($a): endif;");
    matches("while($a) {}");
    matches("for ($i = 1; $i <= 10; $i++) {}");
    matches("switch ($a) {}");
    matches("break;");
    matches("continue;");
    matches("return;");
    matches(";");
    matches("yield $a;");
    matches("global $a;");
    matches("echo \"Hi\";");
    matches("unset($a);");

    matches("$var = function () {};");
  }

  @Test
  public void optional_semicolon() {
    matches("continue ?>");
  }

}
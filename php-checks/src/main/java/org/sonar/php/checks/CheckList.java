/*
 * SonarQube PHP Plugin
 * Copyright (C) 2010-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.php.checks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import org.sonar.php.checks.phpini.AllowUrlCheck;
import org.sonar.php.checks.phpini.CgiForceRedirectCheck;
import org.sonar.php.checks.phpini.EnableDlCheck;
import org.sonar.php.checks.phpini.FileUploadsCheck;
import org.sonar.php.checks.phpini.OpenBasedirCheck;
import org.sonar.php.checks.phpini.SessionUseTransSidCheck;

public class CheckList {

  public static final String REPOSITORY_KEY = "php";

  private CheckList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>of(
      EvalUseCheck.class,
      TooManyCasesInSwitchCheck.class,
      EmptyStatementCheck.class,
      IfConditionAlwaysTrueOrFalseCheck.class,
      CollapsibleIfStatementCheck.class,
      SwitchCaseTooBigCheck.class,
      TooManyReturnCheck.class,
      FunctionNameCheck.class,
      ReturnOfBooleanExpressionCheck.class,
      BooleanEqualityComparisonCheck.class,
      VariableVariablesCheck.class,
      SwitchWithoutDefaultCheck.class,
      AtLeastThreeCasesInSwitchCheck.class,
      ForHidingWhileCheck.class,
      TrailingCommentCheck.class,
      ElseIfWithoutElseCheck.class,
      TooManyLinesInFileCheck.class,
      LineLengthCheck.class,
      EmptyNestedBlockCheck.class,
      NonEmptyCaseWithoutBreakCheck.class,
      DeprecatedPredefinedVariablesUseCheck.class,
      NestedControlFlowDepthCheck.class,
      StringLiteralDuplicatedCheck.class,
      FunctionComplexityCheck.class,
      TabCharacterCheck.class,
      FileHeaderCheck.class,
      ForLoopIncrementSignCheck.class,
      IgnoredReturnValueCheck.class,
      LeftCurlyBraceEndsLineCheck.class,
      AlwaysUseCurlyBracesCheck.class,
      RightCurlyBraceStartsLineCheck.class,
      GotoUseCheck.class,
      ClassNameCheck.class,
      FieldNameCheck.class,
      UnusedFunctionParametersCheck.class,
      ExpressionComplexityCheck.class,
      ForLoopCounterChangedCheck.class,
      FunctionCognitiveComplexityCheck.class,
      ConsistentFunctionReturnCheck.class,
      ConstantNameCheck.class,
      TooManyLinesInFunctionCheck.class,
      TooManyMethodsInClassCheck.class,
      ClassComplexityCheck.class,
      TodoTagPresenceCheck.class,
      FixmeTagPresenceCheck.class,
      ConstructorDeclarationCheck.class,
      CallParentConstructorCheck.class,
      TrailingWhitespaceCheck.class,
      MissingNewLineAtEOFCheck.class,
      UnusedPrivateFieldCheck.class,
      UnusedLocalVariableCheck.class,
      OneStatementPerLineCheck.class,
      ClassCouplingCheck.class,
      LeftCurlyBraceStartsLineCheck.class,
      IncrementDecrementInSubExpressionCheck.class,
      LocalVariableShadowsClassFieldCheck.class,
      LocalVariableAndParameterNameCheck.class,
      ImmediatelyReturnedVariableCheck.class,
      CommentedOutCodeCheck.class,
      ElseIfSequenceKeywordUsageCheck.class,
      ExitOrDieUsageCheck.class,
      AliasFunctionUsageCheck.class,
      VarKeywordUsageCheck.class,
      MissingMethodVisibilityCheck.class,
      KeywordsAndConstantsNotLowerCaseCheck.class,
      OnePropertyDeclarationPerStatementCheck.class,
      ModifiersOrderCheck.class,
      ClosingTagInFullPHPFileCheck.class,
      NonLFCharAsEOLCheck.class,
      NoSonarCheck.class,
      ArgumentWithDefaultValueNotLastCheck.class,
      ArrayCountableCountCheck.class,
      FormattingStandardCheck.class,
      OpeningPHPTagCheck.class,
      PerlStyleCommentsUsageCheck.class,
      TooManyLinesInClassCheck.class,
      PhpSapiNameFunctionUsageCheck.class,
      EchoWithParenthesisCheck.class,
      SilencedErrorsCheck.class,
      TooManyFieldsInClassCheck.class,
      ThisVariableUsageInStaticContextCheck.class,
      ReferenceInFunctionCallCheck.class,
      LogicalWordOperatorUsageCheck.class,
      ConditionalIndentationCheck.class,
      DuplicatedFunctionArgumentCheck.class,
      DuplicatedArgumentCheck.class,
      CodeFollowingJumpStatementCheck.class,
      RedundantFinalCheck.class,
      RedundantParenthesesCheck.class,
      UnusedPrivateMethodCheck.class,
      FunctionDefineOutsideClassCheck.class,
      SelfKeywordUsageCheck.class,
      FileWithSymbolsAndSideEffectsCheck.class,
      GlobalKeywordAndArrayUsageCheck.class,
      MoreThanOneClassInFileCheck.class,
      LowerCaseColorCheck.class,
      NullDereferenceInConditionalCheck.class,
      DirectlyAccessingSuperGlobalCheck.class,
      RequireInsteadOfRequireOnceCheck.class,
      InlineHTMLInFileCheck.class,
      ConcatenatedStringLiteralCheck.class,
      ConditionalOnNewLineCheck.class,
      NestedFunctionDepthCheck.class,
      CharacterBeforeOpeningPHPTagCheck.class,
      MethodNameReturningBooleanCheck.class,
      FileNameCheck.class,
      GenericExceptionCheck.class,
      ConstructorDependencyInversionCheck.class,
      PHPDeprecatedFunctionUsageCheck.class,
      OverridingMethodSimplyCallParentCheck.class,
      TooManyFunctionParametersCheck.class,
      UselessExpressionStatementCheck.class,
      UselessIncrementCheck.class,
      SelfAssignmentCheck.class,
      UselessObjectCreationCheck.class,
      DuplicateConditionCheck.class,
      NestedTernaryOperatorsCheck.class,
      DuplicateBranchImplementationCheck.class,
      AllBranchesIdenticalCheck.class,
      UseOfUninitializedVariableCheck.class,
      InterfaceNameCheck.class,
      CatchRethrowingCheck.class,
      CallToIniSetCheck.class,
      SleepFunctionUsageCheck.class,
      HardCodedCredentialsCheck.class,
      MultilineBlocksCurlyBracesCheck.class,
      SessionCookiePersistenceCheck.class,
      ParsingErrorCheck.class,
      UnusedExceptionCheck.class,
      UseOfEmptyReturnValueCheck.class,
      WrongAssignmentOperatorCheck.class,
      IdenticalOperandsInBinaryExpressionCheck.class,
      DuplicatedMethodCheck.class,
      HardCodedUriCheck.class,
      AssignmentInSubExpressionCheck.class
      );
  }

  public static Iterable<Class> getPhpIniChecks() {
    return ImmutableList.<Class>of(
      AllowUrlCheck.class,
      CgiForceRedirectCheck.class,
      EnableDlCheck.class,
      FileUploadsCheck.class,
      OpenBasedirCheck.class,
      SessionCookiePersistenceCheck.class,
      SessionUseTransSidCheck.class);
  }

  public static Set<Class> getAllChecks() {
    return ImmutableSet.<Class>builder()
      .addAll(CheckList.getChecks())
      .addAll(CheckList.getPhpIniChecks())
      .build();
  }
}

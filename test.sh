cd scripts/

echo "### Lexer tests ###"

./lexerTest.sh

echo " "

echo "### Parser tests ###"
echo " "

./parserTest.sh

echo "#### DeclarationCheck tests ####"
echo " "

./declarationCheckTest.sh

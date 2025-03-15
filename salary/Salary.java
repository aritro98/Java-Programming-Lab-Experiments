interface Salary{
	int earnings();
	int deductions();
	int bonus();
}

abstract class Manager implements Salary{

package com.debyam.exercice155;

/**
 * Le code corrige
 */
interface	IA	{
    public  int	faireA();
    public	void	faire2A();
    public	int	faire3A();
}
class	A	implements	IA	{
    public	int	faireA()	{
        return	2;
    }
    public	void	faire2A()	{
        System.out.println(faireA());
    }
    public int faire3A() {
        return 3;
    }
}
class	Exercice5	{
    public	static	void	main(String[]	args)	{
        A	unA	=	new	A();
        unA.faire2A();
    }
}


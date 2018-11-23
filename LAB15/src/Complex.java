
   public class Complex
    {
        public int a,b;
        Complex()
        {
            a = 0;
            b = 0;
        }
        Complex(int Real1,int Imag1)
        {
            a=Real1;
            b=Imag1;
        }
        void AddComplex(Complex c1,Complex c2)
        {
            System.out.println((c1.a + c2.a)+" + "+ (c1.b+c2.b)+"i");
        }

        void SubComplex(Complex c1,Complex c2)
        {
            System.out.println((c1.a - c2.a)+" + "+ (c1.b - c2.b)+"i");
        }

        void MulComplex(Complex c1,Complex c2)
        {
            System.out.println((c1.a * c2.a - c1.b * c2.b )+" + "+ (c1.b * c2.a + c1.a * c2.b)+"i");
        }

        void DivComplex(Complex c1, Complex c2)
        {
            System.out.println((((c1.a * c2.a + c1.b * c2.b)/(c2.a* c2.a+ c2.b * c2.b)) + ((c1.b * c2.b - c1.a * c2.b)/(c1.a * c1.a + c2.b * c2.b)))+"i");
        }

    }





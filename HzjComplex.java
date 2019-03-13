public class HzjComplex {
    public double RealPart;
    public double ImagePart;

    void setRealPart (double x){
        RealPart = x;
    }

    void setImagePart (double y){
        ImagePart = y;
    }

    HzjComplex ComplexAdd(HzjComplex a){
        HzjComplex b = new HzjComplex();
        b.RealPart = a.RealPart + this.RealPart;
        b.ImagePart = a.ImagePart + this.ImagePart;
        return b;
    }

    HzjComplex ComplexSub(HzjComplex a){
        HzjComplex b = new HzjComplex();
        b.RealPart = a.RealPart - this.RealPart;
        b.ImagePart = a.ImagePart - this.ImagePart;
        return b;
    }

    HzjComplex ComplexMulti(HzjComplex a){
        HzjComplex b = new HzjComplex();
        b.RealPart = this.RealPart * a.RealPart - this.ImagePart * a.ImagePart;
        b.ImagePart = this.ImagePart * a.RealPart + this.RealPart * a.ImagePart;
        return b;
    }

    HzjComplex ComplexDiv(HzjComplex a){
        HzjComplex b = new HzjComplex();
        b.RealPart = (this.RealPart * a.ImagePart + this.ImagePart * a.RealPart) / (a.ImagePart * a.ImagePart + a.RealPart * a.RealPart);
        b.ImagePart = (this.ImagePart * a.ImagePart + this.RealPart * a.RealPart) / (a.ImagePart * a.ImagePart + a.RealPart * a.RealPart);
        return b;
    }

    public String toString() {//重写toString方法
        String str = "";
        if (ImagePart > 0)
            str = RealPart + "+" + ImagePart + "i";
        if (ImagePart == 0)
            str = RealPart+"";
        if (ImagePart < 0)
            str = RealPart + "" + ImagePart + "i";
        return str;
    }

    public boolean equals(Object obj){//重写equals方法
        if (this == obj)
            return true;
        if(obj==null)
            return false;
        if(obj instanceof HzjComplex){
            HzjComplex p = (HzjComplex) obj;
            if(p.RealPart==this.RealPart &&p.ImagePart==this.ImagePart )
                return true;
        }
        return false;
    }

    public HzjComplex(double R,double I){
        RealPart = R ;
        ImagePart = I ;
    }
}

class Square extends Quad
{
	Square(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		Coordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}
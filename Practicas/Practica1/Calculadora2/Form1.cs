using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora2
{
    public partial class Form1 : Form
    {
        double primero;
        double segundo;
        double solucion;
        string operacion;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Pantalla.Clear();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button13_Click(object sender, EventArgs e)
        {
            operacion = "raiz";
            primero = double.Parse(Pantalla.Text);
            solucion = primero;
            Pantalla.Text = Math.Sqrt(primero).ToString();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "1";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            operacion = "+";
            primero = double.Parse(Pantalla.Text);
            Pantalla.Clear();
        }

        private void btncero_Click(object sender, EventArgs e)
        {
            Pantalla.Text=Pantalla.Text + "0";
        }

        private void btndos_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "2";
        }

        private void btntres_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "3";
        }

        private void btncuatro_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "4";
        }

        private void btncinco_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "5";
        }

        private void btnseis_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "6";
        }

        private void btnsiete_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "7";
        }

        private void btnocho_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "8";
        }

        private void btnnueve_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + "9";
        }

        private void btnpunto_Click(object sender, EventArgs e)
        {
            Pantalla.Text = Pantalla.Text + ".";
        }

        private void btnresultado_Click(object sender, EventArgs e)
        {
            segundo = double.Parse(Pantalla.Text);
            switch (operacion)
            {
                case "+":
                    solucion = primero + segundo;
                    Pantalla.Text = solucion.ToString();
                    break;
                case "-":
                    solucion = primero - segundo;
                    Pantalla.Text = solucion.ToString();
                    break;
                case "*":
                    solucion = primero * segundo;
                    Pantalla.Text = solucion.ToString();
                    break;
                case "/":
                    solucion = primero / segundo;
                    Pantalla.Text = solucion.ToString();
                    break;
            }
        }

        private void btnresta_Click(object sender, EventArgs e)
        {
            operacion = "-";
            primero = double.Parse(Pantalla.Text);
            Pantalla.Clear();
        }

        private void btnmultiplicar_Click(object sender, EventArgs e)
        {
            operacion = "*";
            primero = double.Parse(Pantalla.Text);
            Pantalla.Clear();
        }

        private void btndivision_Click(object sender, EventArgs e)
        {
            operacion = "/";
            primero = double.Parse(Pantalla.Text);
            Pantalla.Clear();
        }
    }
}

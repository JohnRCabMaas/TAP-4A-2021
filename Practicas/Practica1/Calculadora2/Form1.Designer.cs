
namespace Calculadora2
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Pantalla = new System.Windows.Forms.TextBox();
            this.btnlimpiar = new System.Windows.Forms.Button();
            this.btnsiete = new System.Windows.Forms.Button();
            this.btncuatro = new System.Windows.Forms.Button();
            this.btnuno = new System.Windows.Forms.Button();
            this.btncero = new System.Windows.Forms.Button();
            this.btndivision = new System.Windows.Forms.Button();
            this.btnmultiplicar = new System.Windows.Forms.Button();
            this.btnresta = new System.Windows.Forms.Button();
            this.btnocho = new System.Windows.Forms.Button();
            this.btnnueve = new System.Windows.Forms.Button();
            this.btnsuma = new System.Windows.Forms.Button();
            this.btncinco = new System.Windows.Forms.Button();
            this.btnseis = new System.Windows.Forms.Button();
            this.btnraiz = new System.Windows.Forms.Button();
            this.btndos = new System.Windows.Forms.Button();
            this.btntres = new System.Windows.Forms.Button();
            this.btnpunto = new System.Windows.Forms.Button();
            this.btnresultado = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // Pantalla
            // 
            this.Pantalla.Location = new System.Drawing.Point(12, 18);
            this.Pantalla.Name = "Pantalla";
            this.Pantalla.ReadOnly = true;
            this.Pantalla.Size = new System.Drawing.Size(276, 31);
            this.Pantalla.TabIndex = 0;
            this.Pantalla.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // btnlimpiar
            // 
            this.btnlimpiar.Location = new System.Drawing.Point(12, 69);
            this.btnlimpiar.Name = "btnlimpiar";
            this.btnlimpiar.Size = new System.Drawing.Size(54, 35);
            this.btnlimpiar.TabIndex = 1;
            this.btnlimpiar.Text = "CE";
            this.btnlimpiar.UseVisualStyleBackColor = true;
            this.btnlimpiar.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnsiete
            // 
            this.btnsiete.Location = new System.Drawing.Point(12, 119);
            this.btnsiete.Name = "btnsiete";
            this.btnsiete.Size = new System.Drawing.Size(54, 35);
            this.btnsiete.TabIndex = 2;
            this.btnsiete.Text = "7";
            this.btnsiete.UseVisualStyleBackColor = true;
            this.btnsiete.Click += new System.EventHandler(this.btnsiete_Click);
            // 
            // btncuatro
            // 
            this.btncuatro.Location = new System.Drawing.Point(12, 173);
            this.btncuatro.Name = "btncuatro";
            this.btncuatro.Size = new System.Drawing.Size(54, 35);
            this.btncuatro.TabIndex = 3;
            this.btncuatro.Text = "4";
            this.btncuatro.UseVisualStyleBackColor = true;
            this.btncuatro.Click += new System.EventHandler(this.btncuatro_Click);
            // 
            // btnuno
            // 
            this.btnuno.Location = new System.Drawing.Point(12, 224);
            this.btnuno.Name = "btnuno";
            this.btnuno.Size = new System.Drawing.Size(54, 35);
            this.btnuno.TabIndex = 4;
            this.btnuno.Text = "1";
            this.btnuno.UseVisualStyleBackColor = true;
            this.btnuno.Click += new System.EventHandler(this.button3_Click);
            // 
            // btncero
            // 
            this.btncero.Location = new System.Drawing.Point(12, 285);
            this.btncero.Name = "btncero";
            this.btncero.Size = new System.Drawing.Size(129, 35);
            this.btncero.TabIndex = 5;
            this.btncero.Text = "0";
            this.btncero.UseVisualStyleBackColor = true;
            this.btncero.Click += new System.EventHandler(this.btncero_Click);
            // 
            // btndivision
            // 
            this.btndivision.Location = new System.Drawing.Point(87, 69);
            this.btndivision.Name = "btndivision";
            this.btndivision.Size = new System.Drawing.Size(54, 35);
            this.btndivision.TabIndex = 6;
            this.btndivision.Text = "/";
            this.btndivision.UseVisualStyleBackColor = true;
            this.btndivision.Click += new System.EventHandler(this.btndivision_Click);
            // 
            // btnmultiplicar
            // 
            this.btnmultiplicar.Location = new System.Drawing.Point(156, 69);
            this.btnmultiplicar.Name = "btnmultiplicar";
            this.btnmultiplicar.Size = new System.Drawing.Size(54, 35);
            this.btnmultiplicar.TabIndex = 7;
            this.btnmultiplicar.Text = "*";
            this.btnmultiplicar.UseVisualStyleBackColor = true;
            this.btnmultiplicar.Click += new System.EventHandler(this.btnmultiplicar_Click);
            // 
            // btnresta
            // 
            this.btnresta.Location = new System.Drawing.Point(234, 69);
            this.btnresta.Name = "btnresta";
            this.btnresta.Size = new System.Drawing.Size(54, 35);
            this.btnresta.TabIndex = 8;
            this.btnresta.Text = "-";
            this.btnresta.UseVisualStyleBackColor = true;
            this.btnresta.Click += new System.EventHandler(this.btnresta_Click);
            // 
            // btnocho
            // 
            this.btnocho.Location = new System.Drawing.Point(87, 119);
            this.btnocho.Name = "btnocho";
            this.btnocho.Size = new System.Drawing.Size(54, 35);
            this.btnocho.TabIndex = 9;
            this.btnocho.Text = "8";
            this.btnocho.UseVisualStyleBackColor = true;
            this.btnocho.Click += new System.EventHandler(this.btnocho_Click);
            // 
            // btnnueve
            // 
            this.btnnueve.Location = new System.Drawing.Point(156, 119);
            this.btnnueve.Name = "btnnueve";
            this.btnnueve.Size = new System.Drawing.Size(54, 35);
            this.btnnueve.TabIndex = 10;
            this.btnnueve.Text = "9";
            this.btnnueve.UseVisualStyleBackColor = true;
            this.btnnueve.Click += new System.EventHandler(this.btnnueve_Click);
            // 
            // btnsuma
            // 
            this.btnsuma.Location = new System.Drawing.Point(234, 119);
            this.btnsuma.Name = "btnsuma";
            this.btnsuma.Size = new System.Drawing.Size(54, 35);
            this.btnsuma.TabIndex = 11;
            this.btnsuma.Text = "+";
            this.btnsuma.UseVisualStyleBackColor = true;
            this.btnsuma.Click += new System.EventHandler(this.button10_Click);
            // 
            // btncinco
            // 
            this.btncinco.Location = new System.Drawing.Point(87, 173);
            this.btncinco.Name = "btncinco";
            this.btncinco.Size = new System.Drawing.Size(54, 35);
            this.btncinco.TabIndex = 12;
            this.btncinco.Text = "5";
            this.btncinco.UseVisualStyleBackColor = true;
            this.btncinco.Click += new System.EventHandler(this.btncinco_Click);
            // 
            // btnseis
            // 
            this.btnseis.Location = new System.Drawing.Point(156, 173);
            this.btnseis.Name = "btnseis";
            this.btnseis.Size = new System.Drawing.Size(54, 35);
            this.btnseis.TabIndex = 13;
            this.btnseis.Text = "6";
            this.btnseis.UseVisualStyleBackColor = true;
            this.btnseis.Click += new System.EventHandler(this.btnseis_Click);
            // 
            // btnraiz
            // 
            this.btnraiz.Location = new System.Drawing.Point(234, 173);
            this.btnraiz.Name = "btnraiz";
            this.btnraiz.Size = new System.Drawing.Size(54, 35);
            this.btnraiz.TabIndex = 14;
            this.btnraiz.Text = "raiz";
            this.btnraiz.UseVisualStyleBackColor = true;
            this.btnraiz.Click += new System.EventHandler(this.button13_Click);
            // 
            // btndos
            // 
            this.btndos.Location = new System.Drawing.Point(87, 224);
            this.btndos.Name = "btndos";
            this.btndos.Size = new System.Drawing.Size(54, 35);
            this.btndos.TabIndex = 15;
            this.btndos.Text = "2";
            this.btndos.UseVisualStyleBackColor = true;
            this.btndos.Click += new System.EventHandler(this.btndos_Click);
            // 
            // btntres
            // 
            this.btntres.Location = new System.Drawing.Point(156, 224);
            this.btntres.Name = "btntres";
            this.btntres.Size = new System.Drawing.Size(54, 35);
            this.btntres.TabIndex = 16;
            this.btntres.Text = "3";
            this.btntres.UseVisualStyleBackColor = true;
            this.btntres.Click += new System.EventHandler(this.btntres_Click);
            // 
            // btnpunto
            // 
            this.btnpunto.Location = new System.Drawing.Point(156, 285);
            this.btnpunto.Name = "btnpunto";
            this.btnpunto.Size = new System.Drawing.Size(54, 35);
            this.btnpunto.TabIndex = 17;
            this.btnpunto.Text = ".";
            this.btnpunto.UseVisualStyleBackColor = true;
            this.btnpunto.Click += new System.EventHandler(this.btnpunto_Click);
            // 
            // btnresultado
            // 
            this.btnresultado.Location = new System.Drawing.Point(234, 224);
            this.btnresultado.Name = "btnresultado";
            this.btnresultado.Size = new System.Drawing.Size(54, 96);
            this.btnresultado.TabIndex = 18;
            this.btnresultado.Text = "=";
            this.btnresultado.UseVisualStyleBackColor = true;
            this.btnresultado.Click += new System.EventHandler(this.btnresultado_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(312, 352);
            this.Controls.Add(this.btnresultado);
            this.Controls.Add(this.btnpunto);
            this.Controls.Add(this.btntres);
            this.Controls.Add(this.btndos);
            this.Controls.Add(this.btnraiz);
            this.Controls.Add(this.btnseis);
            this.Controls.Add(this.btncinco);
            this.Controls.Add(this.btnsuma);
            this.Controls.Add(this.btnnueve);
            this.Controls.Add(this.btnocho);
            this.Controls.Add(this.btnresta);
            this.Controls.Add(this.btnmultiplicar);
            this.Controls.Add(this.btndivision);
            this.Controls.Add(this.btncero);
            this.Controls.Add(this.btnuno);
            this.Controls.Add(this.btncuatro);
            this.Controls.Add(this.btnsiete);
            this.Controls.Add(this.btnlimpiar);
            this.Controls.Add(this.Pantalla);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox Pantalla;
        private System.Windows.Forms.Button btnlimpiar;
        private System.Windows.Forms.Button btnsiete;
        private System.Windows.Forms.Button btncuatro;
        private System.Windows.Forms.Button btnuno;
        private System.Windows.Forms.Button btncero;
        private System.Windows.Forms.Button btndivision;
        private System.Windows.Forms.Button btnmultiplicar;
        private System.Windows.Forms.Button btnresta;
        private System.Windows.Forms.Button btnocho;
        private System.Windows.Forms.Button button9;
        private System.Windows.Forms.Button btnsuma;
        private System.Windows.Forms.Button btncinco;
        private System.Windows.Forms.Button btnseis;
        private System.Windows.Forms.Button btnraiz;
        private System.Windows.Forms.Button btndos;
        private System.Windows.Forms.Button btntres;
        private System.Windows.Forms.Button btnpunto;
        private System.Windows.Forms.Button btnresultado;
        private System.Windows.Forms.Button btnnueve;
    }
}


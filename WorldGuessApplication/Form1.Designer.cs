namespace WorldGuessApplication {
    partial class Form1 {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing) {
            if (disposing && (components != null)) {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent() {
            FilteredWord = new Label();
            label1 = new Label();
            UserInput = new TextBox();
            GuessBtn = new Button();
            WrongGuess = new TextBox();
            SuspendLayout();
            // 
            // FilteredWord
            // 
            FilteredWord.BackColor = Color.DarkSeaGreen;
            FilteredWord.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            FilteredWord.ForeColor = Color.White;
            FilteredWord.Location = new Point(12, 9);
            FilteredWord.Name = "FilteredWord";
            FilteredWord.Size = new Size(383, 45);
            FilteredWord.TabIndex = 0;
            FilteredWord.Text = "Word To Guess";
            FilteredWord.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // label1
            // 
            label1.BackColor = Color.DarkSeaGreen;
            label1.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.White;
            label1.Location = new Point(401, 9);
            label1.Name = "label1";
            label1.Size = new Size(191, 25);
            label1.TabIndex = 1;
            label1.Text = "Wrong Guess";
            label1.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // UserInput
            // 
            UserInput.BorderStyle = BorderStyle.FixedSingle;
            UserInput.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            UserInput.Location = new Point(51, 57);
            UserInput.Name = "UserInput";
            UserInput.Size = new Size(300, 33);
            UserInput.TabIndex = 2;
            // 
            // GuessBtn
            // 
            GuessBtn.BackColor = Color.DarkSeaGreen;
            GuessBtn.FlatStyle = FlatStyle.Flat;
            GuessBtn.Font = new Font("Segoe UI", 9.75F, FontStyle.Bold, GraphicsUnit.Point);
            GuessBtn.ForeColor = Color.White;
            GuessBtn.Location = new Point(132, 96);
            GuessBtn.Name = "GuessBtn";
            GuessBtn.Size = new Size(125, 26);
            GuessBtn.TabIndex = 3;
            GuessBtn.Text = "Guess";
            GuessBtn.UseVisualStyleBackColor = false;
            GuessBtn.Click += GuessBtn_Click;
            // 
            // WrongGuess
            // 
            WrongGuess.BorderStyle = BorderStyle.FixedSingle;
            WrongGuess.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            WrongGuess.Location = new Point(401, 37);
            WrongGuess.Multiline = true;
            WrongGuess.Name = "WrongGuess";
            WrongGuess.ReadOnly = true;
            WrongGuess.ScrollBars = ScrollBars.Vertical;
            WrongGuess.Size = new Size(208, 91);
            WrongGuess.TabIndex = 5;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(596, 132);
            Controls.Add(WrongGuess);
            Controls.Add(GuessBtn);
            Controls.Add(UserInput);
            Controls.Add(label1);
            Controls.Add(FilteredWord);
            Name = "Form1";
            Text = "Guess The Word";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label FilteredWord;
        private Label label1;
        private TextBox UserInput;
        private Button GuessBtn;
        private TextBox WrongGuess;
    }
}
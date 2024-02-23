#pragma once
//#include "ComPorts.h"
#include "Windows.h"
#include <string>
#define lengthStr 38

namespace Lab2ComPorts {
	struct structData {
		HANDLE ComPort;
		std::string nameOfComPort;
	};

	using namespace System;
	using namespace System::ComponentModel;
	using namespace System::Collections;
	using namespace System::Windows::Forms;
	using namespace System::Data;
	using namespace System::Drawing;

	/// <summary>
	/// Сводка для MyForm
	/// </summary>
	public ref class MyForm : public System::Windows::Forms::Form
	{
	//public:
		//ComPorts Com1, Com2;
	private: System::Windows::Forms::Label^ label5;
	public:
	private: System::Windows::Forms::Label^ label6;
	private: System::Windows::Forms::Label^ label7;
	private:
		int lastPosition = 0;
	private:
		structData * Com1, * Com2;
		int countSymboles = 0;
	private: System::Windows::Forms::Label^ label8;
	public:
	private: System::Windows::Forms::Label^ label9;

	public:
		MyForm(void)
		{
			InitializeComponent();
			//
			//TODO: добавьте код конструктора
			//

			Com1 = new structData;
			Com2 = new structData;
			configuration(Com1, "COM1", 1);
			configuration(Com2, "COM2", 2);
		}

	protected:
		/// <summary>
		/// Освободить все используемые ресурсы.
		/// </summary>
		~MyForm()
		{
			if (components)
			{
				delete components;
			}
		}
	private: System::Windows::Forms::Label^ label1;
	protected:
	private: System::Windows::Forms::Label^ label2;
	private: System::Windows::Forms::Label^ label3;
	private: System::Windows::Forms::Label^ label4;
	private: System::Windows::Forms::TextBox^ textBox1;



	private: System::Windows::Forms::Button^ button1;
	private: System::Windows::Forms::Button^ button2;


	protected:





	public:
		int configuration(structData* data, std::string name, int choice) {

			LPCTSTR nameOfPort;
			//string nameOfComPort = (string)name;
			data->nameOfComPort = name;
			//HANDLE ComPort;
			if (choice == 1) {
				nameOfPort = L"COM1";
				data->ComPort = ::CreateFile(nameOfPort, GENERIC_WRITE, 0, 0, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, 0);
			}
			else if (choice == 2) {
				nameOfPort = L"COM2";
				data->ComPort = ::CreateFile(nameOfPort, GENERIC_READ, 0, 0, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, 0);
			}
			if (data->ComPort == INVALID_HANDLE_VALUE)
			{
				if (GetLastError() == ERROR_FILE_NOT_FOUND) {
					label7->Text = label7->Text + "COM-порт не существует!\n";
					return 1;
				}

				else {

					label7->Text = label7->Text + "Ошибка COM-порта!\n";
					return 1;
				}
			}
			else {
				label7->Text = label7->Text + "Соединение с COM-портом!\n";
			}

			DCB Serial_Params = { 0 };
			Serial_Params.DCBlength = sizeof(Serial_Params);
			Serial_Params.BaudRate = CBR_9600;
			Serial_Params.ByteSize = 8;
			Serial_Params.StopBits = ONESTOPBIT;
			Serial_Params.Parity = NOPARITY;

			if (!SetCommState(data->ComPort, &Serial_Params)) {
				label7->Text = label7->Text + "Ошибка настройки состояния COM-порта!\n";
				return 1;
			}
			return 0;
		}

		void writeInCOM(wchar_t data) {
			DWORD Size = sizeof(data);
			DWORD Bytes_Written;
			if (!WriteFile(Com1->ComPort, &data, Size, &Bytes_Written, NULL))
				label7->Text = label7->Text + "Ошибка записи в порт!\n";

		}
		wchar_t readFromCOM() {
			DWORD Size;
			wchar_t receivedChar;
			if (!ReadFile(Com2->ComPort, &receivedChar, sizeof(wchar_t), &Size, 0))
				label7->Text = label7->Text + "Ошибка чтения из порта!\n";
			/*if (Size > 0)
				label6->Text = label6->Text + receivedChar;*/
			return receivedChar;
		}
	private:
		/// <summary>
		/// Обязательная переменная конструктора.
		/// </summary>
		System::ComponentModel::Container ^components;

#pragma region Windows Form Designer generated code
		/// <summary>
		/// Требуемый метод для поддержки конструктора — не изменяйте 
		/// содержимое этого метода с помощью редактора кода.
		/// </summary>
		void InitializeComponent(void)
		{
			this->label1 = (gcnew System::Windows::Forms::Label());
			this->label2 = (gcnew System::Windows::Forms::Label());
			this->label3 = (gcnew System::Windows::Forms::Label());
			this->label4 = (gcnew System::Windows::Forms::Label());
			this->textBox1 = (gcnew System::Windows::Forms::TextBox());
			this->button1 = (gcnew System::Windows::Forms::Button());
			this->button2 = (gcnew System::Windows::Forms::Button());
			this->label5 = (gcnew System::Windows::Forms::Label());
			this->label6 = (gcnew System::Windows::Forms::Label());
			this->label7 = (gcnew System::Windows::Forms::Label());
			this->label8 = (gcnew System::Windows::Forms::Label());
			this->label9 = (gcnew System::Windows::Forms::Label());
			this->SuspendLayout();
			// 
			// label1
			// 
			this->label1->AutoSize = true;
			this->label1->Location = System::Drawing::Point(492, 9);
			this->label1->Name = L"label1";
			this->label1->Size = System::Drawing::Size(37, 13);
			this->label1->TabIndex = 0;
			this->label1->Text = L"Result";
			// 
			// label2
			// 
			this->label2->AutoSize = true;
			this->label2->Location = System::Drawing::Point(86, 9);
			this->label2->Name = L"label2";
			this->label2->Size = System::Drawing::Size(86, 13);
			this->label2->TabIndex = 1;
			this->label2->Text = L"Source packege";
			// 
			// label3
			// 
			this->label3->AutoSize = true;
			this->label3->Location = System::Drawing::Point(306, 9);
			this->label3->Name = L"label3";
			this->label3->Size = System::Drawing::Size(65, 13);
			this->label3->TabIndex = 2;
			this->label3->Text = L"Byte staffing";
			// 
			// label4
			// 
			this->label4->AutoSize = true;
			this->label4->Location = System::Drawing::Point(709, 9);
			this->label4->Name = L"label4";
			this->label4->Size = System::Drawing::Size(79, 13);
			this->label4->TabIndex = 3;
			this->label4->Text = L"Window of Log";
			// 
			// textBox1
			// 
			this->textBox1->Location = System::Drawing::Point(39, 349);
			this->textBox1->Multiline = true;
			this->textBox1->Name = L"textBox1";
			this->textBox1->Size = System::Drawing::Size(386, 21);
			this->textBox1->TabIndex = 4;
			this->textBox1->MaxLength = 38;
			/*this->textBox1->TextChanged += gcnew System::EventHandler(this, &MyForm::textBox1_TextChanged);*/
			// 
			// button1
			// 
			this->button1->Location = System::Drawing::Point(15, 376);
			this->button1->Name = L"button1";
			this->button1->Size = System::Drawing::Size(410, 23);
			this->button1->TabIndex = 8;
			this->button1->Text = L"Send";
			this->button1->UseVisualStyleBackColor = true;
			this->button1->Click += gcnew System::EventHandler(this, &MyForm::button1_Click);
			// 
			// button2
			// 
			this->button2->Location = System::Drawing::Point(435, 376);
			this->button2->Name = L"button2";
			this->button2->Size = System::Drawing::Size(410, 23);
			this->button2->TabIndex = 9;
			this->button2->Text = L"Clear";
			this->button2->UseVisualStyleBackColor = true;
			this->button2->Click += gcnew System::EventHandler(this, &MyForm::button2_Click);
			// 
			// label5
			// 
			this->label5->BorderStyle = System::Windows::Forms::BorderStyle::FixedSingle; //Второе окно данных
			this->label5->Location = System::Drawing::Point(225, 40);
			this->label5->Name = L"label5";
			this->label5->Size = System::Drawing::Size(200, 300);
			this->label5->TabIndex = 10;
			// 
			// label6
			// 
			this->label6->BorderStyle = System::Windows::Forms::BorderStyle::FixedSingle;//Третье окно данных
			this->label6->Location = System::Drawing::Point(435, 40);
			this->label6->Name = L"label6";
			this->label6->Size = System::Drawing::Size(200, 300);
			this->label6->TabIndex = 11;
			// 
			// label7
			// 
			this->label7->BorderStyle = System::Windows::Forms::BorderStyle::FixedSingle; //Четвертое окно данных
			this->label7->Location = System::Drawing::Point(645, 40);
			this->label7->Name = L"label7";
			this->label7->Size = System::Drawing::Size(200, 300);
			this->label7->TabIndex = 12;
			// 
			// label8
			// 
			this->label8->BorderStyle = System::Windows::Forms::BorderStyle::FixedSingle; //Первое окно данных
			this->label8->Location = System::Drawing::Point(15, 40);
			this->label8->Name = L"label8";
			this->label8->Size = System::Drawing::Size(200, 300);
			this->label8->TabIndex = 13;
			// 
			// label9
			// 
			this->label9->AutoSize = true;
			this->label9->Location = System::Drawing::Point(12, 352);
			this->label9->Name = L"label9";
			this->label9->Size = System::Drawing::Size(21, 13);
			this->label9->TabIndex = 14;
			this->label9->Text = L"0x:";
			// 
			// MyForm
			// 
			this->AutoScaleDimensions = System::Drawing::SizeF(6, 13);
			this->AutoScaleMode = System::Windows::Forms::AutoScaleMode::Font;
			this->ClientSize = System::Drawing::Size(859, 411);
			this->Controls->Add(this->label9);
			this->Controls->Add(this->label8);
			this->Controls->Add(this->label7);
			this->Controls->Add(this->label6);
			this->Controls->Add(this->label5);
			this->Controls->Add(this->button2);
			this->Controls->Add(this->button1);
			this->Controls->Add(this->label4);
			this->Controls->Add(this->label1);
			this->Controls->Add(this->label3);
			this->Controls->Add(this->label2);
			this->Controls->Add(this->textBox1);
			this->MaximizeBox = false;
			this->Name = L"MyForm";
			this->Text = L"ComPorts";
			this->ResumeLayout(false);
			this->PerformLayout();

		}



private: System::Void button2_Click(System::Object^ sender, System::EventArgs^ e) {

	//textBox1->Clear();
	label5->Text = "";
	label6->Text = "";
	label8->Text = "";
}

	void sendPackage(String^ data) {
		countSymboles = data->Length;
		   for (int i = 0; i < data->Length; i++)
			   writeInCOM(data[i]);
		   acceptPackage();
	}
	
	void acceptPackage() {
		//wchar_t receivedChar;
		String^ dataOfReceived="";
		for (int i = 0; i < countSymboles; i++) {
			//receivedChar = readFromCOM();
			dataOfReceived = dataOfReceived->Concat(dataOfReceived, readFromCOM());
		}
		deByteStuffing(dataOfReceived);
		//label6->Text = label6->Text + dataOfReceived + "\n";
	}
	void packageVerification() {
		int rezult = 0;
		String^ dataOfTextBox = textBox1->Text;
		for(int i=0; i<dataOfTextBox->Length; i++)
			if (!('9' >= dataOfTextBox[i] && dataOfTextBox[i] >= '0' || 'f' >= dataOfTextBox[i] && dataOfTextBox[i] >= 'a')) {
				label7->Text = label7->Text + "Неверная система счисления при вводе данных!\n";
				rezult = 1;
				break;
			}
		if(!rezult)
		if(dataOfTextBox->Length <38)
			label7->Text = label7->Text + "Недостаточная длина пакета!\n";
		else 
			if(!(/*dataOfTextBox[0] == '7'&& dataOfTextBox[1] =='e' ||*/ dataOfTextBox[0] == '0' && dataOfTextBox[1] == 'd'))
				label7->Text = label7->Text + "Неверный флаг!\n";
			else if(!(dataOfTextBox[2] == '0' && dataOfTextBox[3] == 'f'))
				label7->Text = label7->Text + "Неверный размер данных(должен быть 0xf)!\n";
			else {

				label7->Text = label7->Text + "Пакет сформирован верно!\n";
				textBox1->Clear();
				
				//sendPackage(dataOfTextBox);
				dataOfTextBox = dataOfTextBox->Concat(dataOfTextBox, countingCheckSum(dataOfTextBox));
				label8->Text = label8->Text + dataOfTextBox + "\n";
				byteStuffing(dataOfTextBox);
			}
	}
	
	String^ countingCheckSum(String^ data) {
		int hash = 0;
		for (int i = 0; i < data->Length; i++) {
			hash += (data[i] - 'a') * 44111;
			hash = hash ^ (hash >> 8);
		}
		char buf[2];
		//data = data->Concat(data, hash.ToString());
		sprintf(buf, "%02x", hash);
		std::string str = (std::string)buf;
		
		return gcnew String(str.c_str());
	}

	void deByteStuffing(String^ data) {
		String^ helper;
		int pos = 2;
		while (pos < data->Length-1)
			for (pos; pos < data->Length-1; pos++) {
				if (data[pos] == '0' && data[pos + 1] == 'c') {
					helper = data->Substring(pos+3);
					data = data->Remove(pos+1);
					//data = data->Concat(data, "0");
					data = data->Concat(data, helper);
					pos += 2;
					break;
				}
			}
		label6->Text = label6->Text + data + "\n";
		checkTransmissionPackage(data);
	}

	void checkTransmissionPackage(String^ data) {
		String^ checkFCS = "";
		checkFCS = data->Substring(lengthStr);
		data = data->Remove(lengthStr);
		//label6->Text = label6->Text + data + "\n";
		//data = countingCheckSum(data);
		if(data->Compare(data, countingCheckSum(data)))
			label7->Text = label7->Text + "Пакет передан верно!" + "\n";
	}

	void byteStuffing(String^ data) {
		String^ helper;
		int pos = 2;
		while(pos<data->Length-1)
		for (pos; pos < data->Length-1; pos++) {
			if (data[pos] == '0' && data[pos + 1] == 'd' || data[pos] == '0' && data[pos + 1] == 'c') {
				helper=data->Substring(pos+1);
				data = data->Remove(pos);
				data = data->Concat(data, "0c2");
				data = data->Concat(data, helper);
				pos += 4;
				break;
			}
		}
		label5->Text = label5->Text + data+ "\n";
		sendPackage(data);
	}

private: System::Void button1_Click(System::Object^ sender, System::EventArgs^ e) {
	//if(textBox1->TextLength==38)
	packageVerification();
	}
};
}
 
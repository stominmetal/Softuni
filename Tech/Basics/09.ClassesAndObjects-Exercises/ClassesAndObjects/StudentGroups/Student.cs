﻿using System;

namespace StudentGroups
{
    public class Student
    {
        public string Name { get; set; }
        public string Email { get; set; }
        public DateTime RegistrationDate { get; set; }

        public override string ToString()
        {
            return string.Format(this.Email);
        }
    }
}
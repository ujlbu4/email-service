package com.hypertino.services.email

class Email(
             val recipients: Seq[(String, Option[String])],
             val subject: String,
             val ccRecipients: Seq[(String, Option[String])] = Seq.empty,
             val bccRecipients: Seq[(String, Option[String])] = Seq.empty,
             val toName: Option[String] = None,
             val from: Option[String] = None,
             val fromName: Option[String] = None,
             val html: Option[String] = None,
             val text: Option[String] = None,
             val charset: String = "UTF-8"
           )
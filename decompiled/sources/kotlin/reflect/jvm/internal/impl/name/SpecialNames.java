package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class SpecialNames {
    public static final Name ANONYMOUS;
    public static final FqName ANONYMOUS_FQ_NAME;
    public static final Name ARRAY;
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;
    public static final Name DESTRUCT;
    public static final Name ENUM_GET_ENTRIES;
    public static final Name IMPLICIT_SET_PARAMETER;
    public static final Name INIT;
    public static final SpecialNames INSTANCE = new SpecialNames();
    public static final Name ITERATOR;
    public static final Name LOCAL;
    public static final Name NO_NAME_PROVIDED;
    public static final Name RECEIVER;
    public static final Name ROOT_PACKAGE;
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;
    public static final Name THIS;
    public static final Name UNARY;
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        Name nameSpecial = Name.special("<no name provided>");
        AbstractC16544l.m18093f(nameSpecial, "special(...)");
        NO_NAME_PROVIDED = nameSpecial;
        Name nameSpecial2 = Name.special("<root package>");
        AbstractC16544l.m18093f(nameSpecial2, "special(...)");
        ROOT_PACKAGE = nameSpecial2;
        Name nameIdentifier = Name.identifier("Companion");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        DEFAULT_NAME_FOR_COMPANION_OBJECT = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        SAFE_IDENTIFIER_FOR_NO_NAME = nameIdentifier2;
        Name nameSpecial3 = Name.special("<anonymous>");
        AbstractC16544l.m18093f(nameSpecial3, "special(...)");
        ANONYMOUS = nameSpecial3;
        FqName.Companion companion = FqName.Companion;
        Name nameSpecial4 = Name.special("<anonymous>");
        AbstractC16544l.m18093f(nameSpecial4, "special(...)");
        ANONYMOUS_FQ_NAME = companion.topLevel(nameSpecial4);
        Name nameSpecial5 = Name.special("<unary>");
        AbstractC16544l.m18093f(nameSpecial5, "special(...)");
        UNARY = nameSpecial5;
        Name nameSpecial6 = Name.special("<this>");
        AbstractC16544l.m18093f(nameSpecial6, "special(...)");
        THIS = nameSpecial6;
        Name nameSpecial7 = Name.special("<init>");
        AbstractC16544l.m18093f(nameSpecial7, "special(...)");
        INIT = nameSpecial7;
        Name nameSpecial8 = Name.special("<iterator>");
        AbstractC16544l.m18093f(nameSpecial8, "special(...)");
        ITERATOR = nameSpecial8;
        Name nameSpecial9 = Name.special("<destruct>");
        AbstractC16544l.m18093f(nameSpecial9, "special(...)");
        DESTRUCT = nameSpecial9;
        Name nameSpecial10 = Name.special("<local>");
        AbstractC16544l.m18093f(nameSpecial10, "special(...)");
        LOCAL = nameSpecial10;
        Name nameSpecial11 = Name.special("<unused var>");
        AbstractC16544l.m18093f(nameSpecial11, "special(...)");
        UNDERSCORE_FOR_UNUSED_VAR = nameSpecial11;
        Name nameSpecial12 = Name.special("<set-?>");
        AbstractC16544l.m18093f(nameSpecial12, "special(...)");
        IMPLICIT_SET_PARAMETER = nameSpecial12;
        Name nameSpecial13 = Name.special("<array>");
        AbstractC16544l.m18093f(nameSpecial13, "special(...)");
        ARRAY = nameSpecial13;
        Name nameSpecial14 = Name.special("<receiver>");
        AbstractC16544l.m18093f(nameSpecial14, "special(...)");
        RECEIVER = nameSpecial14;
        Name nameSpecial15 = Name.special("<get-entries>");
        AbstractC16544l.m18093f(nameSpecial15, "special(...)");
        ENUM_GET_ENTRIES = nameSpecial15;
    }

    public static final Name safeIdentifier(Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    public final boolean isSafeIdentifier(Name name) {
        AbstractC16544l.m18094g(name, "name");
        String strAsString = name.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString.length() > 0 && !name.isSpecial();
    }
}

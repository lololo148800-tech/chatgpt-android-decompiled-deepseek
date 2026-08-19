package p214Ib;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ib.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC3665h {

    /* JADX INFO: renamed from: Y */
    public static final C3658a f11142Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC3665h[] f11143Z;

    static {
        C3658a c3658a = new C3658a();
        f11142Y = c3658a;
        f11143Z = new EnumC3665h[]{c3658a, new EnumC3665h() { // from class: Ib.b
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4363c(field.getName());
            }
        }, new EnumC3665h() { // from class: Ib.c
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4363c(EnumC3665h.m4362a(field.getName(), ' '));
            }
        }, new EnumC3665h() { // from class: Ib.d
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4362a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC3665h() { // from class: Ib.e
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4362a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC3665h() { // from class: Ib.f
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4362a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC3665h() { // from class: Ib.g
            @Override // p214Ib.EnumC3665h
            /* JADX INFO: renamed from: b */
            public final String mo4361b(Field field) {
                return EnumC3665h.m4362a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    /* JADX INFO: renamed from: a */
    public static String m4362a(String str, char c9) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c9);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m4363c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static EnumC3665h valueOf(String str) {
        return (EnumC3665h) Enum.valueOf(EnumC3665h.class, str);
    }

    public static EnumC3665h[] values() {
        return (EnumC3665h[]) f11143Z.clone();
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo4361b(Field field);
}

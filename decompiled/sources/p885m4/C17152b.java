package p885m4;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks;
import mo.EnumC17357x;
import mp.C17360a;
import mp.InterfaceC17361b;
import no.AbstractC17708b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p026Ao.C0675i;
import p1006s6.C19451a;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1020t7.InterfaceC19806d;
import p1113xn.AbstractC21322p;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p571X9.AbstractC9153J2;
import p633a.AbstractC10441a;
import p861l1.xapn.suYVq;
import p879lp.EnumC17120c;
import p909nm.AbstractC17682p;
import p917o6.AbstractC17850c;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import p943p7.C18303a;
import p943p7.InterfaceC18306d;

/* JADX INFO: renamed from: m4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17152b implements InterfaceC17361b, InterfaceC18306d, TypeCheckingProcedureCallbacks, InterfaceC19806d, InterfaceC17848a {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18908c(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX INFO: renamed from: e */
    public static final String m18909e(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f58090e;
        int length = bArr.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = (i15 + length) / 2;
            while (i16 > i14 && bArr[i16] != 10) {
                i16 += i14;
            }
            int i17 = i16 + 1;
            int i18 = 1;
            while (true) {
                i11 = i17 + i18;
                if (bArr[i11] == 10) {
                    break;
                }
                i18++;
            }
            int i19 = i11 - i17;
            int i20 = i10;
            boolean z10 = false;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (z10) {
                    i12 = 46;
                    z6 = false;
                } else {
                    byte b = bArr2[i20][i21];
                    byte[] bArr4 = AbstractC17708b.f56536a;
                    int i23 = b & 255;
                    z6 = z10;
                    i12 = i23;
                }
                byte b10 = bArr[i17 + i22];
                byte[] bArr5 = AbstractC17708b.f56536a;
                i13 = i12 - (b10 & 255);
                if (i13 != 0) {
                    break;
                }
                i22++;
                i21++;
                if (i22 == i19) {
                    break;
                }
                if (bArr2[i20].length != i21) {
                    z10 = z6;
                } else {
                    if (i20 == bArr2.length - 1) {
                        break;
                    }
                    i20++;
                    z10 = true;
                    i21 = -1;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i24 = i19 - i22;
                    int length2 = bArr2[i20].length - i21;
                    int length3 = bArr2.length;
                    for (int i25 = i20 + 1; i25 < length3; i25++) {
                        length2 += bArr2[i25].length;
                    }
                    if (length2 < i24) {
                        length = i16;
                    } else if (length2 <= i24) {
                        Charset UTF_8 = StandardCharsets.UTF_8;
                        AbstractC16544l.m18093f(UTF_8, "UTF_8");
                        return new String(bArr, i17, i19, UTF_8);
                    }
                }
                i15 = i11 + 1;
            } else {
                length = i16;
            }
            i14 = -1;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m18910g(List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC17357x) obj) != EnumC17357x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC17357x) it.next()).f55378Y);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m18911h(List protocols) {
        AbstractC16544l.m18094g(protocols, "protocols");
        C0675i c0675i = new C0675i();
        for (String str : m18910g(protocols)) {
            c0675i.m1436f1(str.length());
            c0675i.m1444l1(str);
        }
        return c0675i.m1447v0(c0675i.f1970Z);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18912i() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // p943p7.InterfaceC18306d
    /* JADX INFO: renamed from: a */
    public void mo18914a(File batchFile, C18303a c18303a) {
        AbstractC16544l.m18094g(batchFile, "batchFile");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    public boolean assertEqualTypeConstructors(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            m18908c(3);
            throw null;
        }
        if (typeConstructor2 != null) {
            return typeConstructor.equals(typeConstructor2);
        }
        m18908c(4);
        throw null;
    }

    @Override // p943p7.InterfaceC18306d
    /* JADX INFO: renamed from: b */
    public void mo18915b(File batchFile, AbstractC10441a abstractC10441a) {
        AbstractC16544l.m18094g(batchFile, "batchFile");
    }

    @Override // mp.InterfaceC17361b
    /* JADX INFO: renamed from: d */
    public C17360a mo18886d(int i10, int i11, CharSequence charSequence) {
        char cCharAt;
        int i12 = i10 + 4;
        if (i12 >= charSequence.length() || charSequence.charAt(i10 + 1) != 'w' || charSequence.charAt(i10 + 2) != 'w' || charSequence.charAt(i10 + 3) != '.') {
            return null;
        }
        if (i10 != i11 && ((cCharAt = charSequence.charAt(i10 - 1)) == '.' || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= '0' && cCharAt <= '9'))))) {
            i10 = -1;
        }
        if (i10 == -1) {
            return null;
        }
        int iM9701b = AbstractC9153J2.m9701b(i12, charSequence);
        if (iM9701b == -1) {
            iM9701b = -1;
        } else {
            int i13 = iM9701b;
            while (true) {
                i13--;
                if (i13 <= i12) {
                    break;
                }
                if (charSequence.charAt(i13) != '.' || i13 <= i12) {
                }
            }
            iM9701b = -1;
        }
        if (iM9701b == -1) {
            return null;
        }
        return new C17360a(EnumC17120c.f54728o0, i10, iM9701b + 1);
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        C5551u value = (C5551u) obj;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        AbstractC17850c.f56906d.mo369f(writer, customScalarAdapters, value.toString());
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String strConcat = (String) AbstractC17850c.f56906d.mo373j(reader, customScalarAdapters);
        if (!AbstractC21322p.m21667A(strConcat, "+", false) && !AbstractC21322p.m21671E(strConcat, 'Z')) {
            strConcat = strConcat.concat("+00:00");
        }
        return C5550t.m5944c(C5551u.Companion, strConcat);
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: n */
    public File mo12595n(File file) {
        return null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: o */
    public File mo12596o(boolean z6) {
        return null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: r */
    public File mo12597r() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: k */
    public static void m18913k(C0675i sink, String value) {
        String str;
        AbstractC16544l.m18094g(sink, "sink");
        AbstractC16544l.m18094g(value, "value");
        String[] strArr = C19451a.f61710u0;
        sink.m1436f1(34);
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            if (cCharAt < 128) {
                str = strArr[cCharAt];
                if (str != null) {
                    if (i10 < i11) {
                        sink.m1443k1(i10, i11, value);
                    }
                    sink.m1444l1(str);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str = "\\u2028";
                } else if (cCharAt == 8233) {
                    str = suYVq.vobhSZXchvGA;
                }
                if (i10 < i11) {
                    sink.m1443k1(i10, i11, value);
                }
                sink.m1444l1(str);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            sink.m1443k1(i10, length, value);
        }
        sink.m1436f1(34);
    }
}

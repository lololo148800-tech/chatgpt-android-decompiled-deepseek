package p911o0;

import android.os.Parcel;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p008A6.C0384d;
import p013Ab.C0420b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1073w3.AbstractC20817s;
import p214Ib.C3676s;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p479Td.AbstractC7360k;
import p492U1.C7543h;
import p523V9.AbstractC8142m4;
import p537W0.C8410b;
import p571X9.AbstractC9101A4;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13746W;
import p917o6.C17870w;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17834B;
import p917o6.InterfaceC17835C;
import p936p0.C18265e;
import p936p0.C18271k;

/* JADX INFO: renamed from: o0.x */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17792x {
    /* JADX INFO: renamed from: a */
    public static InterfaceC17833A m19518a(InterfaceC17833A interfaceC17833A, InterfaceC17834B key) {
        AbstractC16544l.m18094g(key, "key");
        if (interfaceC17833A.getKey().equals(key)) {
            return interfaceC17833A;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC17835C m19519b(InterfaceC17833A interfaceC17833A, InterfaceC17834B key) {
        AbstractC16544l.m18094g(key, "key");
        return interfaceC17833A.getKey().equals(key) ? C17870w.f56967a : interfaceC17833A;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC17835C m19520c(InterfaceC17835C interfaceC17835C, InterfaceC17835C context) {
        AbstractC16544l.m18094g(context, "context");
        return context == C17870w.f56967a ? interfaceC17835C : (InterfaceC17835C) context.mo4140c(interfaceC17835C, new C0384d(11));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10459q m19521d(C10845a c10845a) {
        C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 400.0f, null, 5);
        Object obj = AbstractC13795w0.f43580a;
        C13746W c13746wM15254s2 = AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1);
        C13746W c13746wM15254s3 = AbstractC13758e.m15254s(0.0f, 400.0f, null, 5);
        c10845a.getClass();
        return new LazyLayoutAnimateItemElement(c13746wM15254s, c13746wM15254s2, c13746wM15254s3);
    }

    /* JADX INFO: renamed from: f */
    public static void m19523f(C0420b c0420b, InterfaceC1436k interfaceC1436k) {
        c0420b.m1060p(0, c0420b.f1381Z - 1, interfaceC1436k);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ short m19524g(int i10) {
        if (i10 == 1) {
            return (short) 0;
        }
        if (i10 == 2) {
            return (short) 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m19525h(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m19526i(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m19527j(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m19528k(C18265e c18265e, String str, InterfaceC1440o interfaceC1440o, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c18265e.m19802o(str, null, interfaceC1440o);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m19529l(C18265e c18265e, int i10, InterfaceC1436k interfaceC1436k, C8410b c8410b, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC1436k = null;
        }
        c18265e.m19803p(i10, interfaceC1436k, C18271k.f58284o0, c8410b);
    }

    /* JADX INFO: renamed from: m */
    public static int m19530m(Class cls, Parcel parcel, ArrayList arrayList, int i10, int i11) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i10 + i11;
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC5985X m19531n(C6021p c6021p, boolean z6, InterfaceC1436k interfaceC1436k, C6021p c6021p2, int i10) {
        c6021p.m6553p(z6);
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p2);
        c6021p.m6524S(i10);
        return interfaceC5985XM6435V;
    }

    /* JADX INFO: renamed from: o */
    public static Object m19532o(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    /* JADX INFO: renamed from: p */
    public static String m19533p(C6021p c6021p, int i10, int i11, C6021p c6021p2, boolean z6) {
        c6021p.m6524S(i10);
        String strM8676d = AbstractC8142m4.m8676d(i11, c6021p2);
        c6021p.m6553p(z6);
        return strM8676d;
    }

    /* JADX INFO: renamed from: q */
    public static String m19534q(String str, int i10, int i11, String str2) {
        return str + i10 + str2 + i11;
    }

    /* JADX INFO: renamed from: r */
    public static String m19535r(C16527D c16527d, Class cls, StringBuilder sb2) {
        sb2.append(c16527d.mo5693b(cls));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public static Iterator m19536s(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    /* JADX INFO: renamed from: t */
    public static void m19537t(int i10, int i11, int i12, int i13, int i14) {
        AbstractC7360k.m7784a(i10);
        AbstractC7360k.m7784a(i11);
        AbstractC7360k.m7784a(i12);
        AbstractC7360k.m7784a(i13);
        AbstractC7360k.m7784a(i14);
    }

    /* JADX INFO: renamed from: u */
    public static void m19538u(int i10, C8410b c8410b, C6021p c6021p, boolean z6) {
        c8410b.invoke(c6021p, Integer.valueOf(i10));
        c6021p.m6553p(z6);
    }

    /* JADX INFO: renamed from: v */
    public static void m19539v(Long l4, C3676s c3676s, String str) {
        c3676s.m4393u(Long.valueOf(l4.longValue()), str);
    }

    /* JADX INFO: renamed from: w */
    public static void m19540w(int i10, int i11, int i12, int i13, int i14) {
        AbstractC20817s.m21425z(i10);
        AbstractC20817s.m21425z(i11);
        AbstractC20817s.m21425z(i12);
        AbstractC20817s.m21425z(i13);
        AbstractC20817s.m21425z(i14);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m19541x(int i10) {
        if (i10 == 1) {
            return "EVENT";
        }
        if (i10 == 2) {
            return "META";
        }
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static void m19542y(C18265e c18265e, String str, C8410b c8410b) {
        ArrayList arrayList = c18265e.f58230c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c18265e.f58230c = arrayList;
        }
        arrayList.add(Integer.valueOf(c18265e.f58229b.f1381Z));
        c18265e.m19802o(str, null, c8410b);
    }
}

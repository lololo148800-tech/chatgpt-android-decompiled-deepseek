package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.NameMap;
import androidx.datastore.preferences.protobuf.C10963i;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.play_billing.C11877H1;
import com.google.android.gms.internal.play_billing.C11933a1;
import com.google.android.gms.internal.play_billing.InterfaceC11985n1;
import com.google.protobuf.AbstractC12195u;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p571X9.AbstractC9239Y;
import p672c3.C11565B0;
import p672c3.C11608h0;
import p672c3.C11631t;
import p672c3.C11632t0;
import p672c3.C11637w;
import p672c3.C11639x;
import p939p3.C18294d;

/* JADX INFO: renamed from: android.gov.nist.javax.sdp.fields.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10763a {
    /* JADX INFO: renamed from: A */
    public static int m11040A(int i10, int i11, int i12, int i13) {
        return AbstractC12195u.m14148v0(i10) + i11 + i12 + i13;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m11041B(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK_NOT_CONNECTED";
            case 2:
                return "NETWORK_ETHERNET";
            case 3:
                return "NETWORK_WIFI";
            case 4:
                return "NETWORK_WIMAX";
            case 5:
                return "NETWORK_BLUETOOTH";
            case 6:
                return "NETWORK_2G";
            case 7:
                return "NETWORK_3G";
            case 8:
                return "NETWORK_4G";
            case 9:
                return "NETWORK_5G";
            case 10:
                return "NETWORK_MOBILE_OTHER";
            case 11:
                return "NETWORK_CELLULAR";
            case 12:
                return "NETWORK_OTHER";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m11042C(int i10) {
        if (i10 == 1) {
            return "Wrap";
        }
        if (i10 == 2) {
            return "Fixed";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "MatchParent";
        }
        return "Expand";
    }

    /* JADX INFO: renamed from: a */
    public static ViewModel m11043a(ViewModelProvider.Factory factory, InterfaceC3756d modelClass, C18294d c18294d) {
        AbstractC16544l.m18094g(modelClass, "modelClass");
        return factory.mo11740b(AbstractC8138m0.m8667b(modelClass), c18294d);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m11044b(int i10) {
        switch (i10) {
            case 1:
                return "network_not_connected";
            case 2:
                return "network_ethernet";
            case 3:
                return "network_wifi";
            case 4:
                return "network_wimax";
            case 5:
                return "network_bluetooth";
            case 6:
                return "network_2G";
            case 7:
                return "network_3G";
            case 8:
                return "network_4G";
            case 9:
                return "network_5G";
            case 10:
                return "network_mobile_other";
            case 11:
                return "network_cellular";
            case 12:
                return "network_other";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m11045c(int i10, int i11, int i12) {
        return C11933a1.m13386n0(i10) + i11 + i12;
    }

    /* JADX INFO: renamed from: d */
    public static int m11046d(int i10, int i11, int i12, int i13) {
        return C10963i.m11628M(i10) + i11 + i12 + i13;
    }

    /* JADX INFO: renamed from: e */
    public static String m11047e(char c9, String str, String str2) {
        return str + str2 + c9;
    }

    /* JADX INFO: renamed from: f */
    public static String m11048f(int i10, String str) {
        return str + i10;
    }

    /* JADX INFO: renamed from: g */
    public static String m11049g(long j10, String str) {
        return str + j10;
    }

    /* JADX INFO: renamed from: h */
    public static String m11050h(long j10, String str, StringBuilder sb2) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m11051i(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: j */
    public static String m11052j(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m11053k(String str, String str2, Class cls, String str3, Class cls2) {
        NameMap.putNameMap(str, str2);
        NameMap.putNameMap(str3, cls.getName());
        return cls2.getName();
    }

    /* JADX INFO: renamed from: l */
    public static String m11054l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: m */
    public static String m11055m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: n */
    public static String m11056n(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m11057o(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m11058p(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    /* JADX INFO: renamed from: q */
    public static C17309l m11059q(int i10, int i11, Integer num) {
        return AbstractC9239Y.m9815b(new C11565B0(i10, i11), num);
    }

    /* JADX INFO: renamed from: r */
    public static C17309l m11060r(int i10, C11631t c11631t) {
        return AbstractC9239Y.m9815b(c11631t, new C11608h0(i10));
    }

    /* JADX INFO: renamed from: s */
    public static C17309l m11061s(int i10, C11639x c11639x) {
        return AbstractC9239Y.m9815b(c11639x, new C11637w(i10));
    }

    /* JADX INFO: renamed from: t */
    public static C17309l m11062t(int i10, C11632t0 c11632t0) {
        return AbstractC9239Y.m9815b(c11632t0, new C11608h0(i10));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m11063u(InterfaceC11985n1 interfaceC11985n1) {
        if (interfaceC11985n1 != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m11064v(C11877H1 c11877h1) {
        if (c11877h1 != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m11065w(String str, String str2, StackLogger stackLogger) {
        stackLogger.logDebug(str + str2);
    }

    /* JADX INFO: renamed from: x */
    public static void m11066x(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    /* JADX INFO: renamed from: y */
    public static void m11067y(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    /* JADX INFO: renamed from: z */
    public static int m11068z(int i10, int i11, int i12, int i13) {
        return ((i10 / i11) * i12) + i13;
    }
}

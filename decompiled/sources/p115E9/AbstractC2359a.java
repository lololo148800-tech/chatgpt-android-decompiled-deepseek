package p115E9;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import ml.C17284b;
import p001A.C0073l0;
import p001A.C0075m0;
import p025An.C0644w;
import p094De.C2025h;
import p098Di.C2056e;
import p098Di.C2057f;
import p098Di.InterfaceC2061j;
import p103Dn.AbstractC2124C;
import p1111xl.C21296a;
import p225Im.InterfaceC3777y;
import p318Mh.AbstractC5362F0;
import p318Mh.C5388a0;
import p318Mh.C5390b0;
import p318Mh.C5391c;
import p318Mh.C5392c0;
import p318Mh.C5396e0;
import p318Mh.C5398f0;
import p318Mh.C5400g0;
import p318Mh.C5402h0;
import p571X9.AbstractC9233X;
import p623Zf.C10327w;
import p623Zf.EnumC10304F;
import p996rm.EnumC19250a;
import pl.C18506a;
import pl.C18509d;
import pl.C18510e;
import pl.C18511f;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2359a {

    /* JADX INFO: renamed from: a */
    public static Context f7315a;

    /* JADX INFO: renamed from: b */
    public static Boolean f7316b;

    /* JADX INFO: renamed from: a */
    public static CameraDevice.StateCallback m3442a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new C0075m0();
        }
        return arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new C0073l0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m3443b(ArrayList arrayList, InterfaceC15088n interfaceC15088n, C21296a c21296a, Charset charset, AbstractC19687c abstractC19687c) {
        C18510e c18510e;
        if (abstractC19687c instanceof C18510e) {
            c18510e = (C18510e) abstractC19687c;
            int i10 = c18510e.f58992p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18510e.f58992p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18510e = new C18510e(abstractC19687c);
            }
        } else {
            c18510e = new C18510e(abstractC19687c);
        }
        Object objM3222u = c18510e.f58991o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18510e.f58992p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3222u);
            C18509d c18509d = new C18509d(new C2025h(arrayList), charset, c21296a, interfaceC15088n, 0);
            C18511f c18511f = new C18511f(interfaceC15088n, null);
            c18510e.f58989Y = interfaceC15088n;
            c18510e.f58990Z = c21296a;
            c18510e.f58992p0 = 1;
            objM3222u = AbstractC2124C.m3222u(c18509d, c18511f, c18510e);
            if (objM3222u == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21296a = c18510e.f58990Z;
            interfaceC15088n = c18510e.f58989Y;
            AbstractC9233X.m9807c(objM3222u);
        }
        if (objM3222u != null) {
            return objM3222u;
        }
        if (!interfaceC15088n.mo1141e()) {
            return interfaceC15088n;
        }
        InterfaceC3777y interfaceC3777y = c21296a.f67701b;
        if (interfaceC3777y != null && interfaceC3777y.mo4452b()) {
            return C17284b.f55106a;
        }
        String message = "No suitable converter found for " + c21296a;
        AbstractC16544l.m18094g(message, "message");
        throw new C18506a(message, null);
    }

    /* JADX INFO: renamed from: c */
    public static final String m3444c(EnumC10304F enumC10304F, C10327w config) {
        AbstractC5362F0 abstractC5362F0;
        AbstractC16544l.m18094g(enumC10304F, "<this>");
        AbstractC16544l.m18094g(config, "config");
        int iOrdinal = enumC10304F.ordinal();
        boolean z6 = config.f30647c;
        switch (iOrdinal) {
            case 0:
                abstractC5362F0 = (!config.f30649e && config.f30648d != null) ? C5400g0.f17665h : C5392c0.f17654h;
                break;
            case 1:
                abstractC5362F0 = C5398f0.f17661h;
                break;
            case 2:
                abstractC5362F0 = !z6 ? C5392c0.f17654h : C5390b0.f17645h;
                break;
            case 3:
                if (!config.f30650f) {
                    abstractC5362F0 = !z6 ? C5390b0.f17645h : C5388a0.f17642h;
                } else {
                    abstractC5362F0 = C5402h0.f17667h;
                }
                break;
            case 4:
                abstractC5362F0 = C5390b0.f17645h;
                break;
            case 5:
                abstractC5362F0 = C5396e0.f17659h;
                break;
            case 6:
                abstractC5362F0 = C5390b0.f17645h;
                break;
            default:
                throw new C0644w();
        }
        abstractC5362F0.getClass();
        return abstractC5362F0.m5885a(C5391c.f17646Z);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2061j m3445d(EnumC10304F enumC10304F) {
        int iOrdinal = enumC10304F.ordinal();
        if (iOrdinal != 1 && iOrdinal != 4 && iOrdinal != 5) {
            return C2056e.f6277a;
        }
        C5392c0 c5392c0 = C5392c0.f17654h;
        c5392c0.getClass();
        return new C2057f(c5392c0.m5885a(C5391c.f17646Z));
    }
}

package p268Kf;

import android.app.Application;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import ba.AbstractC11270b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p1022t9.C19820e;
import p1022t9.InterfaceC19817b;
import p1061vb.C20513d;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p166Ga.C3029c;
import p195Hh.C3430e;
import p475T9.C7278a;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8728v3;
import p571X9.AbstractC9233X;
import p746fa.C13606o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p913o2.AbstractC17803d;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C4668w {

    /* JADX INFO: renamed from: a */
    public final Application f15206a;

    /* JADX INFO: renamed from: b */
    public final C3430e f15207b = AbstractC8168p6.m8749b("ClientQueryService", null);

    public C4668w(Application application) {
        this.f15206a = application;
    }

    /* JADX INFO: renamed from: a */
    public final C21941M1 m5391a(String str) {
        if (AbstractC17803d.m19554a(this.f15206a, str) != 0) {
            return new C21941M1(new C4642A(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public final Object m5392b(AbstractC19687c abstractC19687c) throws Exception {
        C4667v c4667v;
        C4668w c4668w;
        Geocoder geocoder;
        ?? arrayList;
        if (abstractC19687c instanceof C4667v) {
            c4667v = (C4667v) abstractC19687c;
            int i10 = c4667v.f15205q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4667v.f15205q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4667v = new C4667v(this, abstractC19687c);
            }
        } else {
            c4667v = new C4667v(this, abstractC19687c);
        }
        Object obj = c4667v.f15203o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4667v.f15205q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C21941M1 c21941m1M5391a = m5391a("android.permission.ACCESS_COARSE_LOCATION");
            if (c21941m1M5391a != null) {
                return c21941m1M5391a;
            }
            Application application = this.f15206a;
            Geocoder geocoder2 = new Geocoder(application, AbstractC8012V5.m8334g(application));
            int i12 = AbstractC11270b.f34143a;
            C7278a c7278a = new C7278a(application, null, C7278a.f23070k, InterfaceC19817b.f62869l0, C19820e.f62871c);
            try {
                C3029c c3029cM3900d = C3029c.m3900d();
                c3029cM3900d.f9119d = C20513d.f65130Z;
                c3029cM3900d.f9117b = 2414;
                C13606o c13606oM20770b = c7278a.m20770b(0, c3029cM3900d.m3904c());
                AbstractC16544l.m18093f(c13606oM20770b, "getLastLocation(...)");
                c4667v.f15201Y = this;
                c4667v.f15202Z = geocoder2;
                c4667v.f15205q0 = 1;
                Object objM9451a = AbstractC8728v3.m9451a(c13606oM20770b, c4667v);
                if (objM9451a == enumC19250a) {
                    return enumC19250a;
                }
                geocoder = geocoder2;
                obj = objM9451a;
                c4668w = this;
            } catch (SecurityException e10) {
                e = e10;
                c4668w = this;
                AbstractC8160o6.m8731f(c4668w.f15207b, "getLocation exception", e, null, 4);
                return new C21941M1(e);
            } catch (CancellationException e11) {
                e = e11;
                c4668w = this;
                AbstractC8160o6.m8731f(c4668w.f15207b, "getLocation exception", e, null, 4);
                return new C21941M1(e);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Geocoder geocoder3 = c4667v.f15202Z;
            c4668w = c4667v.f15201Y;
            try {
                AbstractC9233X.m9807c(obj);
                geocoder = geocoder3;
            } catch (SecurityException e12) {
                e = e12;
                AbstractC8160o6.m8731f(c4668w.f15207b, "getLocation exception", e, null, 4);
                return new C21941M1(e);
            } catch (CancellationException e13) {
                e = e13;
                AbstractC8160o6.m8731f(c4668w.f15207b, "getLocation exception", e, null, 4);
                return new C21941M1(e);
            }
        }
        Location location = (Location) obj;
        List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (fromLocation != null) {
            List<Address> list = fromLocation;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Address) it.next()).toString());
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C17689w.f56480Y;
        }
        return new C21952P1(new C4671z(latitude, longitude, arrayList));
    }
}

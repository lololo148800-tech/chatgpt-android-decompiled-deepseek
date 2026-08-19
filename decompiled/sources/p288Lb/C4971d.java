package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3656B;
import p214Ib.C3679v;
import p214Ib.EnumC3655A;
import p228J.AbstractC3794B0;
import p265Kb.AbstractC4611d;
import p265Kb.AbstractC4616i;
import p312Mb.AbstractC5316a;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4971d extends AbstractC3656B {

    /* JADX INFO: renamed from: c */
    public static final C4968a f16204c = new C4968a(1);

    /* JADX INFO: renamed from: d */
    public static final C4977j f16205d = new C4977j(new C4971d(EnumC3655A.f11139Z), 0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16206a = 0;

    /* JADX INFO: renamed from: b */
    public final Serializable f16207b;

    public C4971d() {
        ArrayList arrayList = new ArrayList();
        this.f16207b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC4616i.f15045a >= 9) {
            arrayList.add(AbstractC4611d.m5349h(2, 2));
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        Date dateM5873c;
        switch (this.f16206a) {
            case 0:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x = c6381b.mo5634x();
                synchronized (((ArrayList) this.f16207b)) {
                    try {
                        Iterator it = ((ArrayList) this.f16207b).iterator();
                        while (it.hasNext()) {
                            try {
                                dateM5873c = ((DateFormat) it.next()).parse(strMo5634x);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateM5873c = AbstractC5316a.m5873c(strMo5634x, new ParsePosition(0));
                        } catch (ParseException e10) {
                            StringBuilder sbM11058p = AbstractC10763a.m11058p("Failed parsing '", strMo5634x, "' as Date; at path ");
                            sbM11058p.append(c6381b.mo5633j0());
                            throw new C3679v(sbM11058p.toString(), e10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return dateM5873c;
            default:
                int iMo5616N0 = c6381b.mo5616N0();
                int iM24h = AbstractC0010F.m24h(iMo5616N0);
                if (iM24h == 5 || iM24h == 6) {
                    return ((EnumC3655A) this.f16207b).mo4357a(c6381b);
                }
                if (iM24h == 8) {
                    c6381b.mo5627e0();
                    return null;
                }
                throw new C3679v("Expecting number, got: " + AbstractC3794B0.m4474I(iMo5616N0) + "; at path " + c6381b.mo5620T());
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        String str;
        switch (this.f16206a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    c6382c.m7016W();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f16207b).get(0);
                synchronized (((ArrayList) this.f16207b)) {
                    str = dateFormat.format(date);
                    break;
                }
                c6382c.m7010J0(str);
                return;
            default:
                c6382c.m7009H0((Number) obj);
                return;
        }
    }

    public C4971d(EnumC3655A enumC3655A) {
        this.f16207b = enumC3655A;
    }
}

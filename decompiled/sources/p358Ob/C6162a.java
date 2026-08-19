package p358Ob;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p214Ib.AbstractC3656B;
import p214Ib.C3679v;
import p288Lb.C4968a;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Ob.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6162a extends AbstractC3656B {

    /* JADX INFO: renamed from: c */
    public static final C4968a f20063c = new C4968a(3);

    /* JADX INFO: renamed from: d */
    public static final C4968a f20064d = new C4968a(4);

    /* JADX INFO: renamed from: e */
    public static final C4968a f20065e = new C4968a(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20066a;

    /* JADX INFO: renamed from: b */
    public final Object f20067b;

    public C6162a(int i10) {
        this.f20066a = i10;
        switch (i10) {
            case 1:
                this.f20067b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f20067b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private final Object m6720c(C6381b c6381b) throws IOException {
        Time time;
        if (c6381b.mo5616N0() == 9) {
            c6381b.mo5627e0();
            return null;
        }
        String strMo5634x = c6381b.mo5634x();
        try {
            synchronized (this) {
                try {
                    time = new Time(((SimpleDateFormat) this.f20067b).parse(strMo5634x).getTime());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Failed parsing '", strMo5634x, "' as SQL Time; at path ");
            sbM11058p.append(c6381b.mo5633j0());
            throw new C3679v(sbM11058p.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m6721d(C6382c c6382c, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c6382c.m7016W();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.f20067b).format((Date) time);
        }
        c6382c.m7010J0(str);
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        Date date;
        switch (this.f20066a) {
            case 0:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x = c6381b.mo5634x();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f20067b).parse(strMo5634x);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e10) {
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Failed parsing '", strMo5634x, "' as SQL Date; at path ");
                    sbM11058p.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11058p.toString(), e10);
                }
            case 1:
                return m6720c(c6381b);
            default:
                Date date2 = (Date) ((AbstractC3656B) this.f20067b).mo4358a(c6381b);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        String str;
        switch (this.f20066a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    c6382c.m7016W();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f20067b).format((Date) date);
                    break;
                }
                c6382c.m7010J0(str);
                return;
            case 1:
                m6721d(c6382c, obj);
                return;
            default:
                ((AbstractC3656B) this.f20067b).mo4359b(c6382c, (Timestamp) obj);
                return;
        }
    }

    public C6162a(AbstractC3656B abstractC3656B) {
        this.f20066a = 2;
        this.f20067b = abstractC3656B;
    }
}

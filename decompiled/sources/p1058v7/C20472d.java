package p1058v7;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1020t7.C19803a;
import p1020t7.C19807e;
import p1020t7.InterfaceC19806d;
import p102Dm.AbstractC2119a;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8206u4;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p823j3.C16084f;
import p858ko.C16482A;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p943p7.C18303a;
import p943p7.C18304b;
import p943p7.C18308f;
import p943p7.InterfaceC18306d;

/* JADX INFO: renamed from: v7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20472d implements InterfaceC19806d {

    /* JADX INFO: renamed from: Y */
    public final File f64982Y;

    /* JADX INFO: renamed from: Z */
    public final C19807e f64983Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC11256c f64984o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC18306d f64985p0;

    /* JADX INFO: renamed from: q0 */
    public final C20469a f64986q0;

    /* JADX INFO: renamed from: r0 */
    public final long f64987r0;

    /* JADX INFO: renamed from: s0 */
    public final long f64988s0;

    /* JADX INFO: renamed from: t0 */
    public File f64989t0;

    /* JADX INFO: renamed from: u0 */
    public long f64990u0;

    /* JADX INFO: renamed from: v0 */
    public long f64991v0;

    /* JADX INFO: renamed from: w0 */
    public long f64992w0;

    public C20472d(File file, C19807e c19807e, InterfaceC11256c internalLogger, InterfaceC18306d metricsDispatcher) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        AbstractC16544l.m18094g(metricsDispatcher, "metricsDispatcher");
        this.f64982Y = file;
        this.f64983Z = c19807e;
        this.f64984o0 = internalLogger;
        this.f64985p0 = metricsDispatcher;
        this.f64986q0 = new C20469a(this);
        double d10 = c19807e.f62837a;
        this.f64987r0 = AbstractC2119a.m3196j(1.05d * d10);
        this.f64988s0 = AbstractC2119a.m3196j(d10 * 0.95d);
    }

    /* JADX INFO: renamed from: d */
    public static File m21114d(File file) {
        return new File(AbstractC10763a.m11052j(file.getPath(), "_metadata"));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21115f(File file, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        AbstractC16544l.m18093f(name, "file.name");
        Long lM21738y = AbstractC21329w.m21738y(name);
        return (lM21738y != null ? lM21738y.longValue() : 0L) >= jCurrentTimeMillis - j10;
    }

    /* JADX INFO: renamed from: a */
    public final File m21116a(boolean z6) {
        File file = new File(this.f64982Y, String.valueOf(System.currentTimeMillis()));
        File file2 = this.f64989t0;
        long j10 = this.f64991v0;
        if (file2 != null) {
            this.f64985p0.mo18914a(file2, new C18303a(j10, this.f64990u0, z6));
        }
        this.f64989t0 = file;
        this.f64990u0 = 1L;
        this.f64991v0 = System.currentTimeMillis();
        return file;
    }

    /* JADX INFO: renamed from: b */
    public final long m21117b(File file, boolean z6) {
        InterfaceC11256c interfaceC11256c = this.f64984o0;
        if (!AbstractC8206u4.m8824f(file, interfaceC11256c)) {
            return 0L;
        }
        long jM8825g = AbstractC8206u4.m8825g(file, interfaceC11256c);
        if (!AbstractC8206u4.m8823e(file, interfaceC11256c)) {
            return 0L;
        }
        if (z6) {
            this.f64985p0.mo18915b(file, C18308f.f58436d);
        }
        return jM8825g;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m21118c(List list) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f64983Z.f62841e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC16544l.m18093f(name, "it.name");
            Long lM21738y = AbstractC21329w.m21738y(name);
            if ((lM21738y != null ? lM21738y.longValue() : 0L) < jCurrentTimeMillis) {
                InterfaceC11256c interfaceC11256c = this.f64984o0;
                if (AbstractC8206u4.m8823e(file, interfaceC11256c)) {
                    this.f64985p0.mo18915b(file, C18308f.f58435c);
                }
                if (AbstractC8206u4.m8824f(m21114d(file), interfaceC11256c)) {
                    AbstractC8206u4.m8823e(m21114d(file), interfaceC11256c);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final File m21119e(Set set) {
        Object obj = null;
        if (!m21120g()) {
            return null;
        }
        ArrayList arrayListM21118c = m21118c(AbstractC17680n.m19369s0(m21121h()));
        this.f64992w0 = System.currentTimeMillis();
        for (Object obj2 : arrayListM21118c) {
            File file = (File) obj2;
            if (!set.contains(file) && !m21115f(file, this.f64987r0)) {
                obj = obj2;
                break;
            }
        }
        return (File) obj;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m21120g() {
        if (!AbstractC8206u4.m8824f(this.f64982Y, this.f64984o0)) {
            synchronized (this.f64982Y) {
                if (AbstractC8206u4.m8824f(this.f64982Y, this.f64984o0)) {
                    return true;
                }
                if (AbstractC8206u4.m8827i(this.f64982Y, this.f64984o0)) {
                    return true;
                }
                AbstractC7889G0.m8185c(this.f64984o0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C20471c(this, 2), null, 56);
                return false;
            }
        }
        if (!this.f64982Y.isDirectory()) {
            AbstractC7889G0.m8185c(this.f64984o0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C20471c(this, 1), null, 56);
            return false;
        }
        File file = this.f64982Y;
        InterfaceC11256c internalLogger = this.f64984o0;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        if (((Boolean) AbstractC8206u4.m8829k(file, Boolean.FALSE, internalLogger, C19803a.f62827o0)).booleanValue()) {
            return true;
        }
        AbstractC7889G0.m8185c(this.f64984o0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C20471c(this, 0), null, 56);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final List m21121h() {
        File file = this.f64982Y;
        C20469a c20469a = this.f64986q0;
        InterfaceC11256c internalLogger = this.f64984o0;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        File[] fileArr = (File[]) AbstractC8206u4.m8829k(file, null, internalLogger, new C16482A(c20469a, 25));
        if (fileArr == null) {
            fileArr = new File[0];
        }
        return AbstractC17678l.m19291N(fileArr);
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: n */
    public final File mo12595n(File file) {
        boolean zM18089b = AbstractC16544l.m18089b(file.getParent(), this.f64982Y.getPath());
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        if (!zM18089b) {
            AbstractC7889G0.m8185c(this.f64984o0, 2, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C16084f(file, 18, this), null, 56);
        }
        String name = file.getName();
        AbstractC16544l.m18093f(name, "name");
        if (AbstractC21329w.m21738y(name) != null) {
            return m21114d(file);
        }
        AbstractC7889G0.m8185c(this.f64984o0, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 17), null, 56);
        return null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: o */
    public final File mo12596o(boolean z6) {
        File file = null;
        if (!m21120g()) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f64992w0;
        C19807e c19807e = this.f64983Z;
        long j10 = c19807e.f62843g;
        InterfaceC11256c interfaceC11256c = this.f64984o0;
        if (jCurrentTimeMillis > j10) {
            ArrayList arrayListM21118c = m21118c(m21121h());
            Iterator it = arrayListM21118c.iterator();
            long jM8825g = 0;
            while (it.hasNext()) {
                jM8825g += AbstractC8206u4.m8825g((File) it.next(), interfaceC11256c);
            }
            long j11 = c19807e.f62842f;
            long jM21117b = jM8825g - j11;
            if (jM21117b > 0) {
                AbstractC7889G0.m8185c(this.f64984o0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C20470b(jM8825g, j11, jM21117b), null, 56);
                for (File file2 : AbstractC17680n.m19369s0(arrayListM21118c)) {
                    if (jM21117b > 0) {
                        jM21117b = (jM21117b - m21117b(file2, true)) - m21117b(m21114d(file2), false);
                    }
                }
            }
            this.f64992w0 = System.currentTimeMillis();
        }
        if (z6) {
            return m21116a(true);
        }
        File file3 = (File) AbstractC17680n.m19354d0(m21121h());
        if (file3 != null) {
            File file4 = this.f64989t0;
            long j12 = this.f64990u0;
            if (AbstractC16544l.m18089b(file4, file3)) {
                boolean zM21115f = m21115f(file3, this.f64988s0);
                boolean z10 = AbstractC8206u4.m8825g(file3, interfaceC11256c) < c19807e.f62838b;
                boolean z11 = j12 < ((long) c19807e.f62840d);
                if (zM21115f && z10 && z11) {
                    this.f64990u0 = j12 + 1;
                    this.f64991v0 = System.currentTimeMillis();
                    file = file3;
                }
            }
        }
        return file == null ? m21116a(false) : file;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: r */
    public final File mo12597r() {
        if (m21120g()) {
            return this.f64982Y;
        }
        return null;
    }
}

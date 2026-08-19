package p613Z4;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p1020t7.C19807e;
import p1020t7.C19809g;
import p1035u7.C20144b;
import p113E7.InterfaceC2353a;
import p221Ii.RunnableC3724c;
import p661b7.InterfaceC11256c;
import p719e5.C13285a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Z4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10159f {

    /* JADX INFO: renamed from: a */
    public final Object f30089a;

    /* JADX INFO: renamed from: b */
    public final Object f30090b;

    /* JADX INFO: renamed from: c */
    public final Object f30091c;

    /* JADX INFO: renamed from: d */
    public Object f30092d;

    /* JADX INFO: renamed from: e */
    public final Object f30093e;

    public AbstractC10159f(C20144b c20144b, InterfaceC2353a interfaceC2353a, C19809g c19809g, InterfaceC11256c internalLogger, C19807e c19807e) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f30089a = c20144b;
        this.f30090b = interfaceC2353a;
        this.f30091c = c19809g;
        this.f30092d = internalLogger;
        this.f30093e = c19807e;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo10755a();

    /* JADX INFO: renamed from: b */
    public void m10760b(Object obj) {
        synchronized (this.f30091c) {
            Object obj2 = this.f30092d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f30092d = obj;
                ((C13285a) this.f30089a).f41993d.execute(new RunnableC3724c(AbstractC17680n.m19322C0((LinkedHashSet) this.f30093e), 24, this));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10758c();

    /* JADX INFO: renamed from: d */
    public abstract void mo10759d();

    public AbstractC10159f(Context context, C13285a taskExecutor) {
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        this.f30089a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "context.applicationContext");
        this.f30090b = applicationContext;
        this.f30091c = new Object();
        this.f30093e = new LinkedHashSet();
    }
}

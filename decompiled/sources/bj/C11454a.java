package bj;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: bj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11454a extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC11457d f34635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC11471r f34636b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC11457d f34637c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f34638d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Type f34639e;

    public C11454a(AbstractC11457d abstractC11457d, AbstractC11471r abstractC11471r, C11447L c11447l, AbstractC11457d abstractC11457d2, Set set, Type type) {
        this.f34635a = abstractC11457d;
        this.f34636b = abstractC11471r;
        this.f34637c = abstractC11457d2;
        this.f34638d = set;
        this.f34639e = type;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) throws IOException {
        AbstractC11457d abstractC11457d = this.f34637c;
        if (abstractC11457d == null) {
            return this.f34636b.fromJson(abstractC11477x);
        }
        if (!abstractC11457d.f34653g && abstractC11477x.mo12805S() == EnumC11476w.f34694u0) {
            abstractC11477x.mo12815e0();
            return null;
        }
        try {
            return abstractC11457d.mo12859b(abstractC11477x);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new C11473t(cause + " at " + abstractC11477x.m12867E(), cause);
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) throws IOException {
        AbstractC11457d abstractC11457d = this.f34635a;
        if (abstractC11457d == null) {
            this.f34636b.toJson(abstractC11440E, obj);
            return;
        }
        if (!abstractC11457d.f34653g && obj == null) {
            abstractC11440E.mo12829W();
            return;
        }
        try {
            abstractC11457d.mo12860d(abstractC11440E, obj);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new C11473t(cause + " at " + abstractC11440E.m12835P(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.f34638d + Separators.LPAREN + this.f34639e + Separators.RPAREN;
    }
}

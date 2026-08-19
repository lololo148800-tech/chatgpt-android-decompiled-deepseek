package p474T8;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p841k.AbstractC16283c;
import p896n2.AbstractC17449b;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: T8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7268f implements InterfaceC7269g {

    /* JADX INFO: renamed from: a */
    public final String f23048a;

    /* JADX INFO: renamed from: b */
    public final Context f23049b;

    /* JADX INFO: renamed from: c */
    public final Activity f23050c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f23051d;

    /* JADX INFO: renamed from: e */
    public AbstractC16283c f23052e;

    public C7268f(String permission, Context context, Activity activity) {
        AbstractC16544l.m18094g(permission, "permission");
        AbstractC16544l.m18094g(activity, "activity");
        this.f23048a = permission;
        this.f23049b = context;
        this.f23050c = activity;
        this.f23051d = C5997d.m6430Q(m7729d(), C5975S.f19448r0);
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: a */
    public final InterfaceC7272j mo7726a() {
        return (InterfaceC7272j) this.f23051d.getValue();
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: b */
    public final void mo7727b() {
        AbstractC16283c abstractC16283c = this.f23052e;
        if (abstractC16283c == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
        abstractC16283c.mo10188b(this.f23048a);
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: c */
    public final String mo7728c() {
        return this.f23048a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7272j m7729d() {
        Context context = this.f23049b;
        String permission = this.f23048a;
        AbstractC16544l.m18094g(permission, "permission");
        if (AbstractC17803d.m19554a(context, permission) == 0) {
            return C7271i.f23054a;
        }
        Activity activity = this.f23050c;
        AbstractC16544l.m18094g(activity, "<this>");
        return new C7270h(AbstractC17449b.m19126f(activity, permission));
    }

    /* JADX INFO: renamed from: e */
    public final void m7730e() {
        this.f23051d.setValue(m7729d());
    }
}

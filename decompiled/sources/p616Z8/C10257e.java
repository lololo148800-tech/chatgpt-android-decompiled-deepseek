package p616Z8;

import android.content.Context;
import p1061vb.C20513d;
import p140Fa.C2685e;
import p643a9.InterfaceC10527b;
import p745f9.C13591i;

/* JADX INFO: renamed from: Z8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10257e implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30469a;

    /* JADX INFO: renamed from: b */
    public final Object f30470b;

    public /* synthetic */ C10257e(Object obj, int i10) {
        this.f30469a = i10;
        this.f30470b = obj;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f30469a) {
            case 0:
                return new C10256d((Context) ((C10257e) this.f30470b).f30470b, new C2685e(), new C20513d());
            case 1:
                String packageName = ((Context) ((C10257e) this.f30470b).f30470b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new C13591i(Integer.valueOf(C13591i.f42957p0).intValue(), (Context) ((C10257e) this.f30470b).f30470b, "com.google.android.datatransport.events");
            default:
                return this.f30470b;
        }
    }
}

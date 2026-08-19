package p470T4;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p031B3.AbstractC0797a;
import p207I4.C3615b;
import p207I4.InterfaceC3616c;
import p207I4.InterfaceC3617d;
import p233J4.C4260f;

/* JADX INFO: renamed from: T4.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7248m implements InterfaceC3616c {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Context f22989Y;

    public /* synthetic */ C7248m(Context context) {
        this.f22989Y = context;
    }

    @Override // p207I4.InterfaceC3616c
    /* JADX INFO: renamed from: b */
    public InterfaceC3617d mo4327b(C3615b c3615b) {
        Context context = this.f22989Y;
        AbstractC0797a callback = c3615b.f11034c;
        AbstractC16544l.m18094g(callback, "callback");
        String str = c3615b.f11033b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C4260f(context, str, callback, true, true);
    }
}

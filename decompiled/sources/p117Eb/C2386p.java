package p117Eb;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import p1061vb.C20512c;
import p1061vb.C20513d;
import p167Gb.C3031b;
import p658b5.C11238i;
import p832jb.C16187g;
import p890mb.C17220q;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Eb.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2386p implements InterfaceC17207d {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7414Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17220q f7415Z;

    public /* synthetic */ C2386p(C17220q c17220q, int i10) {
        this.f7414Y = i10;
        this.f7415Z = c17220q;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public final Object mo391g(C11238i c11238i) {
        switch (this.f7414Y) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f7415Z, c11238i);
            default:
                return new C20512c((Context) c11238i.mo12555a(Context.class), ((C16187g) c11238i.mo12555a(C16187g.class)).m17795c(), c11238i.m12537E0(C20513d.class), c11238i.mo12569o(C3031b.class), (Executor) c11238i.mo12534C(this.f7415Z));
        }
    }
}

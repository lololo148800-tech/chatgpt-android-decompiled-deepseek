package p1036u9;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import ca.AbstractC11693b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.RunnableC15195M;
import java.util.Set;
import p001A.C0042V0;
import p011A9.C0415f;
import p1009s9.C19499b;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;
import p1060v9.AbstractC20502t;
import p1060v9.C20497o;
import p377P9.AbstractC6375a;
import p377P9.HandlerC6378d;
import p702da.AbstractBinderC13051c;
import p702da.C13049a;
import p702da.C13052d;
import p702da.C13054f;
import p702da.C13055g;
import p960q9.C18648b;
import p999s.C19341c1;

/* JADX INFO: renamed from: u9.y */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC20179y extends AbstractBinderC13051c implements InterfaceC19822g, InterfaceC19823h {

    /* JADX INFO: renamed from: i */
    public static final C0415f f63912i = AbstractC11693b.f35479a;

    /* JADX INFO: renamed from: b */
    public final Context f63913b;

    /* JADX INFO: renamed from: c */
    public final HandlerC6378d f63914c;

    /* JADX INFO: renamed from: d */
    public final C0415f f63915d;

    /* JADX INFO: renamed from: e */
    public final Set f63916e;

    /* JADX INFO: renamed from: f */
    public final C19341c1 f63917f;

    /* JADX INFO: renamed from: g */
    public C13049a f63918g;

    /* JADX INFO: renamed from: h */
    public C0042V0 f63919h;

    public BinderC20179y(Context context, HandlerC6378d handlerC6378d, C19341c1 c19341c1) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 2);
        this.f63913b = context;
        this.f63914c = handlerC6378d;
        this.f63917f = c19341c1;
        this.f63916e = (Set) c19341c1.f61254Y;
        this.f63915d = f63912i;
    }

    @Override // p1022t9.InterfaceC19823h
    /* JADX INFO: renamed from: d */
    public final void mo20772d(C19499b c19499b) {
        this.f63919h.m222p(c19499b);
    }

    @Override // p1022t9.InterfaceC19822g
    /* JADX INFO: renamed from: i */
    public final void mo20771i(int i10) {
        C0042V0 c0042v0 = this.f63919h;
        C20171q c20171q = (C20171q) ((C20159e) c0042v0.f209r0).f63866v0.get((C20155a) c0042v0.f206o0);
        if (c20171q != null) {
            if (c20171q.f63892i) {
                c20171q.m21005o(new C19499b(17));
            } else {
                c20171q.mo20771i(i10);
            }
        }
    }

    @Override // p1022t9.InterfaceC19822g
    public final void onConnected() {
        C13049a c13049a = this.f63918g;
        c13049a.getClass();
        try {
            c13049a.f41474z.getClass();
            Account account = new Account("<<default account>>", wNrQXvwLiB.EJBZGhiTEaZT);
            GoogleSignInAccount googleSignInAccountM20007b = "<<default account>>".equals(account.name) ? C18648b.m20005a(c13049a.f36070c).m20007b() : null;
            Integer num = c13049a.f41472B;
            AbstractC20502t.m21157h(num);
            C20497o c20497o = new C20497o(2, account, num.intValue(), googleSignInAccountM20007b);
            C13052d c13052d = (C13052d) c13049a.m13209q();
            C13054f c13054f = new C13054f(1, c20497o);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c13052d.f18446c);
            AbstractC6375a.m6989c(parcelObtain, c13054f);
            AbstractC6375a.m6990d(parcelObtain, this);
            c13052d.m6112d(parcelObtain, 12);
        } catch (RemoteException e10) {
            AbstractC15256t.m16482t("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f63914c.post(new RunnableC15195M(this, 17, new C13055g(1, new C19499b(8, null), null)));
            } catch (RemoteException unused) {
                AbstractC15256t.m16485w("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}

package p333N9;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.AbstractC15256t;
import p001A.AbstractC0010F;
import p013Ab.C0420b;
import p1009s9.AbstractC19505h;
import p1009s9.C19506i;
import p1022t9.C19820e;
import p1022t9.C19828m;
import p1036u9.C20166l;
import p1036u9.C20167m;
import p1036u9.C20173s;
import p1060v9.AbstractC20502t;
import p115E9.C2360b;
import p115E9.C2361c;
import p523V9.AbstractC7933L4;
import p746fa.C13599h;
import p846k4.C16340i;
import p849k7.C16361n;
import p889m9.AbstractC17199a;
import p903n9.C17532f;
import p903n9.C17535i;
import p945p9.C18310a;
import p960q9.AbstractC18654h;
import p960q9.C18648b;
import p960q9.C18653g;
import p960q9.C18655i;
import p960q9.RunnableC18649c;

/* JADX INFO: renamed from: N9.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5681b extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f18447b;

    /* JADX INFO: renamed from: c */
    public final Object f18448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5681b(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f18447b = 3;
        this.f18448c = revocationBoundService;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: l */
    public final boolean mo6122l(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        Object obj = this.f18448c;
        switch (this.f18447b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) AbstractC5688i.m6131a(parcel, Status.CREATOR);
                C17535i c17535i = (C17535i) AbstractC5688i.m6131a(parcel, C17535i.CREATOR);
                AbstractC5688i.m6132b(parcel);
                AbstractC7933L4.m8224b(status, c17535i, (C13599h) obj);
                return true;
            case 1:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) AbstractC5688i.m6131a(parcel, Status.CREATOR);
                C17532f c17532f = (C17532f) AbstractC5688i.m6131a(parcel, C17532f.CREATOR);
                AbstractC5688i.m6132b(parcel);
                AbstractC7933L4.m8224b(status2, c17532f, (C13599h) obj);
                return true;
            case 2:
                if (i10 != 1) {
                    return false;
                }
                Status status3 = (Status) AbstractC5688i.m6131a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) AbstractC5688i.m6131a(parcel, PendingIntent.CREATOR);
                AbstractC5688i.m6132b(parcel);
                AbstractC7933L4.m8224b(status3, pendingIntent, (C13599h) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    m6123p();
                    C18655i.m20023t(revocationBoundService).m20034u();
                    return true;
                }
                m6123p();
                C18648b c18648bM20005a = C18648b.m20005a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountM20007b = c18648bM20005a.m20007b();
                GoogleSignInOptions googleSignInOptionsM20008c = GoogleSignInOptions.f36018w0;
                if (googleSignInAccountM20007b != null) {
                    googleSignInOptionsM20008c = c18648bM20005a.m20008c();
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsM20008c;
                AbstractC20502t.m21157h(googleSignInOptions);
                C18310a c18310a = new C18310a((RevocationBoundService) obj, null, AbstractC17199a.f54907a, googleSignInOptions, new C19820e(new C16361n(), Looper.getMainLooper()));
                C20173s c20173s = c18310a.f62881h;
                Context context = c18310a.f62874a;
                if (googleSignInAccountM20007b == null) {
                    boolean z6 = c18310a.m19841c() == 3;
                    C0420b c0420b = AbstractC18654h.f59411a;
                    if (c0420b.f1381Z <= 3) {
                        Log.d((String) c0420b.f1382o0, ((String) c0420b.f1383p0).concat("Signing out"));
                    }
                    AbstractC18654h.m20020a(context);
                    if (z6) {
                        Status status4 = Status.f36047q0;
                        C20166l c20166l = new C20166l(c20173s);
                        c20166l.m13187g(status4);
                        basePendingResult = c20166l;
                    } else {
                        C18653g c18653g = new C18653g(c20173s, 0);
                        c20173s.m21007a(c18653g);
                        basePendingResult = c18653g;
                    }
                    basePendingResult.m13183c(new C20167m(basePendingResult, new C13599h(), new C16340i()));
                    return true;
                }
                boolean z10 = c18310a.m19841c() == 3;
                C0420b c0420b2 = AbstractC18654h.f59411a;
                if (c0420b2.f1381Z <= 3) {
                    Log.d((String) c0420b2.f1382o0, ((String) c0420b2.f1383p0).concat("Revoking access"));
                }
                String strM20010e = C18648b.m20005a(context).m20010e("refreshToken");
                AbstractC18654h.m20020a(context);
                if (!z10) {
                    C18653g c18653g2 = new C18653g(c20173s, 1);
                    c20173s.m21007a(c18653g2);
                    basePendingResult2 = c18653g2;
                } else if (strM20010e == null) {
                    C0420b c0420b3 = RunnableC18649c.f59394o0;
                    Status status5 = new Status(4, null, null, null);
                    AbstractC20502t.m21150a("Status code must not be SUCCESS", !status5.m13182b());
                    C19828m c19828m = new C19828m(status5);
                    c19828m.m13187g(status5);
                    basePendingResult2 = c19828m;
                } else {
                    RunnableC18649c runnableC18649c = new RunnableC18649c(strM20010e);
                    new Thread(runnableC18649c).start();
                    basePendingResult2 = runnableC18649c.f59396Z;
                }
                basePendingResult2.m13183c(new C20167m(basePendingResult2, new C13599h(), new C16340i()));
                return true;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6123p() {
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.f18448c;
        C2360b c2360bM3449a = C2361c.m3449a(revocationBoundService);
        c2360bM3449a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c2360bM3449a.f7317Y.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C19506i c19506iM20604V = C19506i.m20604V(revocationBoundService);
                c19506iM20604V.getClass();
                if (packageInfo != null) {
                    if (C19506i.m20607c0(packageInfo, false)) {
                        return;
                    }
                    if (C19506i.m20607c0(packageInfo, true)) {
                        Context context = (Context) c19506iM20604V.f61960Z;
                        try {
                            if (!AbstractC19505h.f61955c) {
                                PackageInfo packageInfo2 = C2361c.m3449a(context).f7317Y.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                C19506i.m20604V(context);
                                if (packageInfo2 == null || C19506i.m20607c0(packageInfo2, false) || !C19506i.m20607c0(packageInfo2, true)) {
                                    AbstractC19505h.f61954b = false;
                                } else {
                                    AbstractC19505h.f61954b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            AbstractC15256t.m16483u("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                        } finally {
                            AbstractC19505h.f61955c = true;
                        }
                        if (AbstractC19505h.f61954b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            AbstractC15256t.m16482t("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(AbstractC0010F.m19c(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5681b(C13599h c13599h, int i10) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 0);
        this.f18447b = i10;
        switch (i10) {
            case 1:
                this.f18448c = c13599h;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
                break;
            case 2:
                this.f18448c = c13599h;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
                break;
            default:
                this.f18448c = c13599h;
                break;
        }
    }
}

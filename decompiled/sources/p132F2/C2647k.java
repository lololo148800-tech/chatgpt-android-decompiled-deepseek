package p132F2;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.p649os.OutcomeReceiver;
import android.util.Log;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0235c;
import p003A1.AbstractC0305y0;
import p1113xn.AbstractC21329w;
import p157G2.AbstractC2979e;
import p157G2.C2977c;
import p157G2.C2978d;
import p157G2.C2980f;
import p160G5.p161rK.TVCuK;
import p231J2.C4200a;
import p544W9.AbstractC8694q;

/* JADX INFO: renamed from: F2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2647k implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2643g f8161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2648l f8162b;

    public C2647k(C2643g c2643g, C2648l c2648l) {
        this.f8161a = c2643g;
        this.f8162b = c2648l;
    }

    public final void onResult(Object obj) {
        AbstractC0235c c2649m;
        GetCredentialResponse response = AbstractC0305y0.m892k(obj);
        AbstractC16544l.m18094g(response, "response");
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        C2643g c2643g = this.f8161a;
        this.f8162b.getClass();
        Credential credential = response.getCredential();
        AbstractC16544l.m18093f(credential, "response.credential");
        String type = credential.getType();
        AbstractC16544l.m18093f(type, "credential.type");
        Bundle data = credential.getData();
        AbstractC16544l.m18093f(data, "credential.data");
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                    AbstractC16544l.m18091d(string);
                    AbstractC16544l.m18091d(string2);
                    c2649m = new C2653q(string2, data, 0);
                } catch (Exception unused) {
                    throw new C4200a();
                }
            } else {
                if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new C4200a();
                }
                try {
                    String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                    AbstractC16544l.m18091d(string3);
                    c2649m = new C2653q(string3, data, 1);
                } catch (Exception unused2) {
                    throw new C4200a();
                }
            }
        } catch (C4200a unused3) {
            c2649m = new C2649m(type, data);
        }
        c2643g.m3625b(new C2651o(c2649m));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[Catch: a -> 0x009c, TryCatch #0 {a -> 0x009c, blocks: (B:22:0x0088, B:24:0x008e, B:25:0x0096, B:26:0x009b), top: B:32:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[Catch: a -> 0x009c, TryCatch #0 {a -> 0x009c, blocks: (B:22:0x0088, B:24:0x008e, B:25:0x0096, B:26:0x009b), top: B:32:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    public final void onError(Throwable th2) {
        String type;
        AbstractC2979e c2978d;
        String type2;
        String message;
        GetCredentialException error = AbstractC0305y0.m889h(th2);
        AbstractC16544l.m18094g(error, "error");
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        C2643g c2643g = this.f8161a;
        this.f8162b.getClass();
        String type3 = error.getType();
        switch (type3.hashCode()) {
            case -781118336:
                if (!type3.equals(TVCuK.ltTMkclR)) {
                    type = error.getType();
                    AbstractC16544l.m18093f(type, "error.type");
                    if (!AbstractC21329w.m21734u(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        String type4 = error.getType();
                        AbstractC16544l.m18093f(type4, "error.type");
                        c2978d = new C2978d(type4, error.getMessage());
                    } else {
                        int i10 = C2978d.f8946Y;
                        type2 = error.getType();
                        AbstractC16544l.m18093f(type2, "error.type");
                        message = error.getMessage();
                        try {
                            if (AbstractC21329w.m21734u(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                int i11 = C2978d.f8946Y;
                                c2978d = AbstractC8694q.m9395b(type2, message);
                            } else {
                                throw new C4200a();
                            }
                        } catch (C4200a unused) {
                            c2978d = new C2978d(type2, message);
                        }
                    }
                } else {
                    c2978d = new C2980f(error.getMessage());
                }
                c2643g.m3624a(c2978d);
                return;
            case -45448328:
                if (!type3.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    type = error.getType();
                    AbstractC16544l.m18093f(type, "error.type");
                    if (!AbstractC21329w.m21734u(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        String type5 = error.getType();
                        AbstractC16544l.m18093f(type5, "error.type");
                        c2978d = new C2978d(type5, error.getMessage());
                    } else {
                        int i12 = C2978d.f8946Y;
                        type2 = error.getType();
                        AbstractC16544l.m18093f(type2, "error.type");
                        message = error.getMessage();
                        if (AbstractC21329w.m21734u(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i13 = C2978d.f8946Y;
                            c2978d = AbstractC8694q.m9395b(type2, message);
                        } else {
                            throw new C4200a();
                        }
                    }
                } else {
                    c2978d = new C2978d(error.getMessage(), 1);
                }
                c2643g.m3624a(c2978d);
                return;
            case 580557411:
                if (!type3.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    type = error.getType();
                    AbstractC16544l.m18093f(type, "error.type");
                    if (!AbstractC21329w.m21734u(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        String type6 = error.getType();
                        AbstractC16544l.m18093f(type6, "error.type");
                        c2978d = new C2978d(type6, error.getMessage());
                    } else {
                        int i14 = C2978d.f8946Y;
                        type2 = error.getType();
                        AbstractC16544l.m18093f(type2, "error.type");
                        message = error.getMessage();
                        if (AbstractC21329w.m21734u(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i15 = C2978d.f8946Y;
                            c2978d = AbstractC8694q.m9395b(type2, message);
                        } else {
                            throw new C4200a();
                        }
                    }
                } else {
                    c2978d = new C2977c(error.getMessage());
                }
                c2643g.m3624a(c2978d);
                return;
            case 627896683:
                if (!type3.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    type = error.getType();
                    AbstractC16544l.m18093f(type, "error.type");
                    if (!AbstractC21329w.m21734u(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        String type7 = error.getType();
                        AbstractC16544l.m18093f(type7, "error.type");
                        c2978d = new C2978d(type7, error.getMessage());
                    } else {
                        int i16 = C2978d.f8946Y;
                        type2 = error.getType();
                        AbstractC16544l.m18093f(type2, "error.type");
                        message = error.getMessage();
                        if (AbstractC21329w.m21734u(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i17 = C2978d.f8946Y;
                            c2978d = AbstractC8694q.m9395b(type2, message);
                        } else {
                            throw new C4200a();
                        }
                    }
                } else {
                    c2978d = new C2978d(error.getMessage(), 3);
                }
                c2643g.m3624a(c2978d);
                return;
            default:
                type = error.getType();
                AbstractC16544l.m18093f(type, "error.type");
                if (!AbstractC21329w.m21734u(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    String type8 = error.getType();
                    AbstractC16544l.m18093f(type8, "error.type");
                    c2978d = new C2978d(type8, error.getMessage());
                } else {
                    int i18 = C2978d.f8946Y;
                    type2 = error.getType();
                    AbstractC16544l.m18093f(type2, "error.type");
                    message = error.getMessage();
                    if (AbstractC21329w.m21734u(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        int i19 = C2978d.f8946Y;
                        c2978d = AbstractC8694q.m9395b(type2, message);
                    } else {
                        throw new C4200a();
                    }
                }
                c2643g.m3624a(c2978d);
                return;
        }
    }
}

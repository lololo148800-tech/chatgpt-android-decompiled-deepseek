package p484Ti;

import android.media.MediaDrm;
import android.os.Build;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p530Vi.InterfaceC8294B;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ti.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7474c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7476e f23734Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f23735Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23736o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7474c(C7476e c7476e, boolean z6, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23734Y = c7476e;
        this.f23735Z = z6;
        this.f23736o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7474c(this.f23734Y, this.f23735Z, this.f23736o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7474c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c A[PHI: r2 r4
      0x006c: PHI (r2v3 java.lang.String) = (r2v10 java.lang.String), (r2v8 java.lang.String) binds: [B:35:0x008f, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r4v2 android.media.MediaDrm) = (r4v1 android.media.MediaDrm), (r4v4 android.media.MediaDrm) binds: [B:35:0x008f, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MediaDrm mediaDrm;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C7476e c7476e = this.f23734Y;
        c7476e.getClass();
        String str = this.f23736o0;
        MediaDrm mediaDrm2 = null;
        strM19282E = null;
        strM19282E = null;
        strM19282E = null;
        String strM19282E = null;
        if (!this.f23735Z) {
            InterfaceC8294B interfaceC8294B = c7476e.f23743o0;
            if (interfaceC8294B != null) {
                String strMo7525b = interfaceC8294B.mo7525b(3);
                return strMo7525b == null ? str : strMo7525b;
            }
            AbstractC16544l.m18103p("storage");
            throw null;
        }
        int i10 = Build.VERSION.SDK_INT;
        try {
            mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                AbstractC16544l.m18093f(propertyByteArray, "wvDrm.getPropertyByteArr…ROPERTY_DEVICE_UNIQUE_ID)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(propertyByteArray);
                byte[] bArrDigest = messageDigest.digest();
                AbstractC16544l.m18093f(bArrDigest, "md.digest()");
                strM19282E = AbstractC17678l.m19282E(bArrDigest, "", C7477f.f23748Z, 30);
                if (i10 >= 28) {
                    mediaDrm.release();
                } else {
                    mediaDrm.release();
                }
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (mediaDrm != null) {
                    }
                } else if (mediaDrm != null) {
                    mediaDrm.release();
                }
                return strM19282E == null ? str : str;
            } catch (Throwable th2) {
                th = th2;
                mediaDrm2 = mediaDrm;
                if (Build.VERSION.SDK_INT >= 28) {
                    if (mediaDrm2 != null) {
                        mediaDrm2.release();
                    }
                } else if (mediaDrm2 != null) {
                    mediaDrm2.release();
                }
                throw th;
            }
        } catch (Exception unused2) {
            mediaDrm = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (strM19282E == null && strM19282E.length() != 0) {
            return strM19282E;
        }
    }
}

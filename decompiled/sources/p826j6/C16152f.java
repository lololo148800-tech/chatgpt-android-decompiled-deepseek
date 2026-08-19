package p826j6;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.C11907S;
import com.google.android.gms.internal.play_billing.C12027y;
import java.util.ArrayList;
import p449S9.C7042K;
import p618Za.C10267f;
import p817j$.lang.Iterable$EL;

/* JADX INFO: renamed from: j6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16152f {

    /* JADX INFO: renamed from: a */
    public String f50139a;

    /* JADX INFO: renamed from: b */
    public ArrayList f50140b;

    /* JADX INFO: renamed from: c */
    public boolean f50141c;

    /* JADX INFO: renamed from: d */
    public C7042K f50142d;

    /* JADX INFO: renamed from: a */
    public final C16154h m17776a() {
        AbstractC11857B abstractC11857BM13222u;
        ArrayList arrayList = this.f50140b;
        boolean z6 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z6) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        Iterable$EL.forEach(this.f50140b, new C16141J());
        C16154h c16154h = new C16154h();
        c16154h.f50145a = z6 && !((C16153g) this.f50140b.get(0)).f50143a.m17782d().isEmpty();
        c16154h.f50146b = this.f50139a;
        C7042K c7042k = this.f50142d;
        boolean z10 = (TextUtils.isEmpty((String) c7042k.f22496c) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z10 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c7042k.f22495b && !z10 && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C10267f c10267f = new C10267f();
        c10267f.f30497a = (String) c7042k.f22496c;
        c10267f.f30498b = c7042k.f22494a;
        c16154h.f50147c = c10267f;
        c16154h.f50149e = new ArrayList();
        c16154h.f50150f = this.f50141c;
        ArrayList arrayList2 = this.f50140b;
        if (arrayList2 != null) {
            abstractC11857BM13222u = AbstractC11857B.m13222u(arrayList2);
        } else {
            C12027y c12027y = AbstractC11857B.f36097Z;
            abstractC11857BM13222u = C11907S.f36188q0;
        }
        c16154h.f50148d = abstractC11857BM13222u;
        return c16154h;
    }
}

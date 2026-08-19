package p523V9;

import android.os.Parcel;
import android.os.Parcelable;
import fj.C13676h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p1060v9.AbstractC20502t;
import p1078w9.InterfaceC20852b;
import p531Vj.C8361c0;
import p729ej.AbstractC13422m;
import p729ej.C13415f;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17440t;

/* JADX INFO: renamed from: V9.u5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8207u5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25654a;

    /* JADX INFO: renamed from: a */
    public static InterfaceC20852b m8830a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC20502t.m21157h(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC20852b interfaceC20852b = (InterfaceC20852b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC20852b;
    }

    /* JADX INFO: renamed from: b */
    public static final C17425e m8831b() {
        C17425e c17425e = f25654a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C17433m(9.0f, 16.17f));
        arrayList.add(new C17432l(4.83f, 12.0f));
        arrayList.add(new C17440t(-1.42f, 1.41f));
        arrayList.add(new C17432l(9.0f, 19.0f));
        arrayList.add(new C17432l(21.0f, 7.0f));
        arrayList.add(new C17440t(-1.41f, -1.41f));
        arrayList.add(new C17432l(9.0f, 16.17f));
        arrayList.add(C17429i.f55733c);
        C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25654a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC13422m m8832c(C13415f c13415f, AbstractC13422m workflow, C13676h workflowSession) {
        AbstractC16544l.m18094g(c13415f, ahZQMZ.uMFwFAei);
        AbstractC16544l.m18094g(workflow, "workflow");
        AbstractC16544l.m18094g(workflowSession, "workflowSession");
        return c13415f == C13415f.f42491a ? workflow : new C8361c0(c13415f, workflow, workflowSession, 1);
    }
}

package p333N9;

import android.app.PendingIntent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p334Na.BinderC5699f;
import p334Na.C5694a;
import p334Na.C5701h;
import p357Oa.AbstractC6151d;
import p357Oa.C6161n;
import p378Pa.C6379a;
import p425Ra.BinderC6834g;
import p425Ra.C6836i;
import p500Ua.BinderC7596e;
import p500Ua.C7593b;
import p524Va.AbstractC8249a;
import p524Va.C8255g;
import p524Va.C8256h;
import p572Xa.AbstractC9421o;
import p746fa.C13599h;

/* JADX INFO: renamed from: N9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5687h extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18459a;

    public /* synthetic */ AbstractBinderC5687h(int i10) {
        this.f18459a = i10;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i10 = this.f18459a;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1028k(int i10, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo6122l(int i10, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: m */
    public boolean mo6128m(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo6129n(Parcel parcel, int i10);

    /* JADX INFO: renamed from: o */
    public abstract boolean mo6130o(int i10, Parcel parcel, Parcel parcel2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = 0;
        switch (this.f18459a) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo6122l(i10, parcel, parcel2);
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                BinderC5699f binderC5699f = (BinderC5699f) this;
                if (i10 != 2) {
                    if (i10 == 3) {
                        Parcelable.Creator creator = Bundle.CREATOR;
                        int i13 = AbstractC6151d.f20036a;
                        int iDataAvail = parcel.dataAvail();
                        if (iDataAvail > 0) {
                            throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                        }
                        binderC5699f.f18476d.f18480a.m6718c(binderC5699f.f18475c);
                        binderC5699f.f18474b.m7758K("onCompleteUpdate", new Object[0]);
                    }
                    return i12;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i14 = AbstractC6151d.f20036a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator2.createFromParcel(parcel));
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                C6161n c6161n = binderC5699f.f18476d.f18480a;
                C13599h c13599h = binderC5699f.f18475c;
                c6161n.m6718c(c13599h);
                binderC5699f.f18474b.m7758K("onRequestInfo", new Object[0]);
                if (bundle.getInt("error.code", -2) != 0) {
                    c13599h.m15115c(new C6379a(bundle.getInt("error.code", -2)));
                } else {
                    bundle.getInt("version.code", -1);
                    int i15 = bundle.getInt("update.availability");
                    bundle.getInt("install.status", 0);
                    Integer numValueOf = bundle.getInt("client.version.staleness", -1) != -1 ? Integer.valueOf(bundle.getInt("client.version.staleness")) : null;
                    bundle.getInt("in.app.update.priority", 0);
                    bundle.getLong("bytes.downloaded");
                    bundle.getLong("total.bytes.to.download");
                    long j10 = bundle.getLong("additional.size.required");
                    C5701h c5701h = binderC5699f.f18477e.f18483d;
                    c5701h.getClass();
                    long jM6142a = C5701h.m6142a(new File(c5701h.f18484a.getFilesDir(), "assetpacks"));
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
                    PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
                    PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
                    PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
                    HashMap map = new HashMap();
                    ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                    HashSet hashSet = new HashSet();
                    if (integerArrayList != null) {
                        hashSet.addAll(integerArrayList);
                    }
                    map.put("blocking.destructive.intent", hashSet);
                    ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                    HashSet hashSet2 = new HashSet();
                    if (integerArrayList2 != null) {
                        hashSet2.addAll(integerArrayList2);
                    }
                    map.put("nonblocking.destructive.intent", hashSet2);
                    ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                    HashSet hashSet3 = new HashSet();
                    if (integerArrayList3 != null) {
                        hashSet3.addAll(integerArrayList3);
                    }
                    map.put("blocking.intent", hashSet3);
                    ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                    HashSet hashSet4 = new HashSet();
                    if (integerArrayList4 != null) {
                        hashSet4.addAll(integerArrayList4);
                    }
                    map.put("nonblocking.intent", hashSet4);
                    c13599h.m15116d(new C5694a(i15, numValueOf, j10, jM6142a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map));
                }
                i12 = 1;
                return i12;
            case 2:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo1028k(i10, parcel, parcel2);
            case 3:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo6128m(i10, parcel, parcel2);
            case 4:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo6129n(parcel, i10);
            case 5:
            case 7:
            case 9:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 6:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                BinderC7596e binderC7596e = (BinderC7596e) this;
                if (i10 == 2) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i16 = AbstractC8249a.f25733a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    C8256h c8256h = binderC7596e.f24024d.f24026a;
                    if (c8256h != null) {
                        C13599h c13599h2 = binderC7596e.f24023c;
                        synchronized (c8256h.f25748f) {
                            c8256h.f25747e.remove(c13599h2);
                            break;
                        }
                        c8256h.m8892a().post(new C8255g(c8256h, i12));
                    }
                    binderC7596e.f24022b.m5360c("onGetLaunchReviewFlowInfo", new Object[0]);
                    binderC7596e.f24023c.m15116d(new C7593b((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                    i12 = 1;
                }
                return i12;
            case 8:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                BinderC6834g binderC6834g = (BinderC6834g) this;
                if (i10 == 2) {
                    Bundle bundle3 = (Bundle) AbstractC9421o.m9996a(parcel, Bundle.CREATOR);
                    AbstractC9421o.m9997b(parcel);
                    binderC6834g.mo7273h(bundle3);
                } else {
                    if (i10 != 3) {
                        C13599h c13599h3 = binderC6834g.f21922b;
                        C6836i c6836i = binderC6834g.f21923c;
                        if (i10 == 4 || i10 == 5) {
                            AbstractC9421o.m9997b(parcel);
                            c6836i.f21932e.m9986c(c13599h3);
                        }
                        return i12;
                    }
                    Bundle bundle4 = (Bundle) AbstractC9421o.m9996a(parcel, Bundle.CREATOR);
                    AbstractC9421o.m9997b(parcel);
                    binderC6834g.mo7272c(bundle4);
                }
                i12 = 1;
                return i12;
            case 10:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return mo6130o(i10, parcel, parcel2);
        }
    }

    public AbstractBinderC5687h(String str, int i10) {
        this.f18459a = i10;
        switch (i10) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}

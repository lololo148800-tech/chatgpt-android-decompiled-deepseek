package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10947a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public abstract int mo11521a();

    /* JADX INFO: renamed from: b */
    public final int m11522b(InterfaceC10948a0 interfaceC10948a0) {
        AbstractC10987u abstractC10987u = (AbstractC10987u) this;
        int i10 = abstractC10987u.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int iMo11497e = interfaceC10948a0.mo11497e(this);
        abstractC10987u.memoizedSerializedSize = iMo11497e;
        return iMo11497e;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo11523c(C10963i c10963i);
}

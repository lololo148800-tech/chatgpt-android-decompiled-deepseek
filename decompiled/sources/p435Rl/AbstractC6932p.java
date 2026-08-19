package p435Rl;

import java.util.Observable;
import p387Pl.C6460G;

/* JADX INFO: renamed from: Rl.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6932p extends Observable {
    /* JADX INFO: renamed from: a */
    public void mo7314a() {
        deleteObservers();
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo5400b();

    /* JADX INFO: renamed from: c */
    public final void m7315c() {
        setChanged();
        notifyObservers();
    }

    /* JADX INFO: renamed from: d */
    public abstract C6460G mo5401d();
}

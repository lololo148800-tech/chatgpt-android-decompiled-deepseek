package p615Z6;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Z6.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10249y extends AbstractC10199Y implements InterfaceC10197W {

    /* JADX INFO: renamed from: h */
    public ArrayList f30440h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Boolean f30441i;

    /* JADX INFO: renamed from: j */
    public Matrix f30442j;

    /* JADX INFO: renamed from: k */
    public int f30443k;

    /* JADX INFO: renamed from: l */
    public String f30444l;

    @Override // p615Z6.InterfaceC10197W
    public final List getChildren() {
        return this.f30440h;
    }

    @Override // p615Z6.InterfaceC10197W
    /* JADX INFO: renamed from: j */
    public final void mo10773j(AbstractC10202a0 abstractC10202a0) throws C10168A0 {
        if (abstractC10202a0 instanceof C10192Q) {
            this.f30440h.add(abstractC10202a0);
            return;
        }
        throw new C10168A0("Gradient elements cannot contain " + abstractC10202a0 + " elements.");
    }
}

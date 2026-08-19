package p945p9;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: p9.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18312c implements Comparator {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C18312c f58450Z = new C18312c(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58451Y;

    public /* synthetic */ C18312c(int i10) {
        this.f58451Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f58451Y) {
            case 0:
                break;
        }
        return ((Scope) obj).f36046Z.compareTo(((Scope) obj2).f36046Z);
    }
}

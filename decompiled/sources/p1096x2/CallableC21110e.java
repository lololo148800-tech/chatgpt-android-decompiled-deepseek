package p1096x2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: x2.e */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC21110e implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f67054c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f67055d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67056e;

    public /* synthetic */ CallableC21110e(String str, Context context, Object obj, int i10, int i11) {
        this.f67052a = i11;
        this.f67053b = str;
        this.f67054c = context;
        this.f67056e = obj;
        this.f67055d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f67055d;
        Object obj = this.f67056e;
        Context context = this.f67054c;
        String str = this.f67053b;
        switch (this.f67052a) {
            case 0:
                Object[] objArr = {(C21109d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC21112g.m21583b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return AbstractC21112g.m21583b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new C21111f(-3);
                }
        }
    }
}

package p1118y2;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.openai.chatgpt.MainActivity;
import kotlin.jvm.internal.AbstractC16544l;
import p594Y9.C9895g4;

/* JADX INFO: renamed from: y2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21371b extends C9895g4 {

    /* JADX INFO: renamed from: Z */
    public final ViewGroupOnHierarchyChangeListenerC21370a f67847Z;

    public C21371b(MainActivity mainActivity) {
        super(mainActivity);
        this.f67847Z = new ViewGroupOnHierarchyChangeListenerC21370a(this, mainActivity);
    }

    @Override // p594Y9.C9895g4
    /* JADX INFO: renamed from: A */
    public final void mo10549A() {
        MainActivity mainActivity = (MainActivity) this.f29409Y;
        Resources.Theme theme = mainActivity.getTheme();
        AbstractC16544l.m18093f(theme, "activity.theme");
        m10553I(theme, new TypedValue());
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f67847Z);
    }
}

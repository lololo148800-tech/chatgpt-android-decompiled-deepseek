package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2070h implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ScrollView f6375a;

    /* JADX INFO: renamed from: b */
    public final TextView f6376b;

    /* JADX INFO: renamed from: c */
    public final Button f6377c;

    /* JADX INFO: renamed from: d */
    public final ImageView f6378d;

    /* JADX INFO: renamed from: e */
    public final TextView f6379e;

    /* JADX INFO: renamed from: f */
    public final ImageView f6380f;

    /* JADX INFO: renamed from: g */
    public final Pi2NavigationBar f6381g;

    /* JADX INFO: renamed from: h */
    public final TextView f6382h;

    /* JADX INFO: renamed from: i */
    public final ButtonWithLoadingIndicator f6383i;

    public C2070h(ScrollView scrollView, TextView textView, Button button, ImageView imageView, TextView textView2, ImageView imageView2, Pi2NavigationBar pi2NavigationBar, TextView textView3, ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f6375a = scrollView;
        this.f6376b = textView;
        this.f6377c = button;
        this.f6378d = imageView;
        this.f6379e = textView2;
        this.f6380f = imageView2;
        this.f6381g = pi2NavigationBar;
        this.f6382h = textView3;
        this.f6383i = buttonWithLoadingIndicator;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6375a;
    }
}

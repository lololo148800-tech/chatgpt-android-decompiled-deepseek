package p893n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.datepicker.ViewOnClickListenerC12047l;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import p182H3.HandlerC3203d;
import p880m.AbstractC17123a;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17372d {

    /* JADX INFO: renamed from: A */
    public final int f55449A;

    /* JADX INFO: renamed from: B */
    public final boolean f55450B;

    /* JADX INFO: renamed from: C */
    public final HandlerC3203d f55451C;

    /* JADX INFO: renamed from: a */
    public final Context f55453a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC17373e f55454b;

    /* JADX INFO: renamed from: c */
    public final Window f55455c;

    /* JADX INFO: renamed from: d */
    public CharSequence f55456d;

    /* JADX INFO: renamed from: e */
    public String f55457e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f55458f;

    /* JADX INFO: renamed from: g */
    public Button f55459g;

    /* JADX INFO: renamed from: h */
    public String f55460h;

    /* JADX INFO: renamed from: i */
    public Message f55461i;

    /* JADX INFO: renamed from: j */
    public Button f55462j;

    /* JADX INFO: renamed from: k */
    public String f55463k;

    /* JADX INFO: renamed from: l */
    public Message f55464l;

    /* JADX INFO: renamed from: m */
    public Button f55465m;

    /* JADX INFO: renamed from: n */
    public String f55466n;

    /* JADX INFO: renamed from: o */
    public Message f55467o;

    /* JADX INFO: renamed from: p */
    public NestedScrollView f55468p;

    /* JADX INFO: renamed from: q */
    public Drawable f55469q;

    /* JADX INFO: renamed from: r */
    public ImageView f55470r;

    /* JADX INFO: renamed from: s */
    public TextView f55471s;

    /* JADX INFO: renamed from: t */
    public TextView f55472t;

    /* JADX INFO: renamed from: u */
    public View f55473u;

    /* JADX INFO: renamed from: v */
    public ListAdapter f55474v;

    /* JADX INFO: renamed from: x */
    public final int f55476x;

    /* JADX INFO: renamed from: y */
    public final int f55477y;

    /* JADX INFO: renamed from: z */
    public final int f55478z;

    /* JADX INFO: renamed from: w */
    public int f55475w = -1;

    /* JADX INFO: renamed from: D */
    public final ViewOnClickListenerC12047l f55452D = new ViewOnClickListenerC12047l(this, 2);

    public C17372d(Context context, DialogInterfaceC17373e dialogInterfaceC17373e, Window window) {
        this.f55453a = context;
        this.f55454b = dialogInterfaceC17373e;
        this.f55455c = window;
        HandlerC3203d handlerC3203d = new HandlerC3203d();
        handlerC3203d.f9665b = new WeakReference(dialogInterfaceC17373e);
        this.f55451C = handlerC3203d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC17123a.f54736e, R.attr.alertDialogStyle, 0);
        this.f55476x = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f55477y = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f55478z = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f55449A = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f55450B = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC17373e.m19048e().mo19068h(1);
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m19046a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}

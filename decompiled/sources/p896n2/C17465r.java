package p896n2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import p174Gk.uSfJ.HpucjswO;
import p228J.AbstractC3794B0;
import p228J.AbstractC3812N;
import p658b5.C11238i;
import p692d0.C12967f;

/* JADX INFO: renamed from: n2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C17465r {

    /* JADX INFO: renamed from: a */
    public final Context f55823a;

    /* JADX INFO: renamed from: e */
    public CharSequence f55827e;

    /* JADX INFO: renamed from: f */
    public CharSequence f55828f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f55829g;

    /* JADX INFO: renamed from: h */
    public IconCompat f55830h;

    /* JADX INFO: renamed from: i */
    public int f55831i;

    /* JADX INFO: renamed from: j */
    public int f55832j;

    /* JADX INFO: renamed from: l */
    public boolean f55834l;

    /* JADX INFO: renamed from: m */
    public AbstractC3812N f55835m;

    /* JADX INFO: renamed from: o */
    public Bundle f55837o;

    /* JADX INFO: renamed from: r */
    public String f55840r;

    /* JADX INFO: renamed from: s */
    public final boolean f55841s;

    /* JADX INFO: renamed from: t */
    public final Notification f55842t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f55843u;

    /* JADX INFO: renamed from: b */
    public final ArrayList f55824b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f55825c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f55826d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f55833k = true;

    /* JADX INFO: renamed from: n */
    public boolean f55836n = false;

    /* JADX INFO: renamed from: p */
    public int f55838p = 0;

    /* JADX INFO: renamed from: q */
    public int f55839q = 0;

    public C17465r(Context context, String str) {
        Notification notification = new Notification();
        this.f55842t = notification;
        this.f55823a = context;
        this.f55840r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f55832j = 0;
        this.f55843u = new ArrayList();
        this.f55841s = true;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m19163b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: c */
    public final void m19165c(int i10, boolean z6) {
        Notification notification = this.f55842t;
        if (z6) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19166d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f55823a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f32890k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f32892b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f55830h = iconCompat;
    }

    /* JADX INFO: renamed from: e */
    public final void m19167e(AbstractC3812N abstractC3812N) {
        if (this.f55835m != abstractC3812N) {
            this.f55835m = abstractC3812N;
            if (((C17465r) abstractC3812N.f11539Z) != this) {
                abstractC3812N.f11539Z = this;
                m19167e(abstractC3812N);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Notification m19164a() {
        Notification notificationBuild;
        Bundle bundle;
        Bundle[] bundleArr;
        int i10;
        ArrayList arrayList;
        int i11;
        C11238i c11238i = new C11238i();
        new ArrayList();
        c11238i.f34011p0 = new Bundle();
        c11238i.f34010o0 = this;
        Context context = this.f55823a;
        c11238i.f34008Y = context;
        if (Build.VERSION.SDK_INT >= 26) {
            c11238i.f34009Z = AbstractC17458k.m19139a(context, this.f55840r);
        } else {
            c11238i.f34009Z = new Notification.Builder(this.f55823a);
        }
        Notification notification = this.f55842t;
        Resources resources = null;
        ((Notification.Builder) c11238i.f34009Z).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f55827e).setContentText(this.f55828f).setContentInfo(null).setContentIntent(this.f55829g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f55831i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) c11238i.f34009Z;
        IconCompat iconCompat = this.f55830h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m11389g(context));
        ((Notification.Builder) c11238i.f34009Z).setSubText(null).setUsesChronometer(this.f55834l).setPriority(this.f55832j);
        for (C17459l c17459l : this.f55824b) {
            if (c17459l.f55812b == null && (i11 = c17459l.f55816f) != 0) {
                c17459l.f55812b = IconCompat.m11384b(null, "", i11);
            }
            IconCompat iconCompat2 = c17459l.f55812b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.m11389g(null) : null, c17459l.f55817g, c17459l.f55818h);
            AbstractC17473z[] abstractC17473zArr = c17459l.f55813c;
            if (abstractC17473zArr != null) {
                int length = abstractC17473zArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (abstractC17473zArr.length > 0) {
                    AbstractC17473z abstractC17473z = abstractC17473zArr[0];
                    throw null;
                }
                for (int i12 = 0; i12 < length; i12++) {
                    builder2.addRemoteInput(remoteInputArr[i12]);
                }
            }
            Bundle bundle2 = c17459l.f55811a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z6 = c17459l.f55814d;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z6);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 24) {
                AbstractC17466s.m19169b(builder2, z6);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                AbstractC17467t.m19172a(builder2);
            }
            if (i13 >= 29) {
                AbstractC17453f.m19135d(builder2);
            }
            if (i13 >= 31) {
                AbstractC17468u.m19173a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c17459l.f55815e);
            builder2.addExtras(bundle3);
            ((Notification.Builder) c11238i.f34009Z).addAction(builder2.build());
        }
        Bundle bundle4 = this.f55837o;
        if (bundle4 != null) {
            ((Bundle) c11238i.f34011p0).putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) c11238i.f34009Z).setShowWhen(this.f55833k);
        ((Notification.Builder) c11238i.f34009Z).setLocalOnly(this.f55836n);
        ((Notification.Builder) c11238i.f34009Z).setGroup(null);
        ((Notification.Builder) c11238i.f34009Z).setSortKey(null);
        ((Notification.Builder) c11238i.f34009Z).setGroupSummary(false);
        ((Notification.Builder) c11238i.f34009Z).setCategory(null);
        ((Notification.Builder) c11238i.f34009Z).setColor(this.f55838p);
        ((Notification.Builder) c11238i.f34009Z).setVisibility(this.f55839q);
        ((Notification.Builder) c11238i.f34009Z).setPublicVersion(null);
        ((Notification.Builder) c11238i.f34009Z).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f55843u;
        ArrayList arrayList3 = this.f55825c;
        if (i14 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw AbstractC3794B0.m4497v(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C12967f c12967f = new C12967f(arrayList2.size() + arrayList.size());
                    c12967f.addAll(arrayList);
                    c12967f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c12967f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) c11238i.f34009Z).addPerson((String) it2.next());
            }
        }
        ArrayList arrayList4 = this.f55826d;
        if (arrayList4.size() > 0) {
            if (this.f55837o == null) {
                this.f55837o = new Bundle();
            }
            Bundle bundle5 = this.f55837o.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                String string = Integer.toString(i15);
                C17459l c17459l2 = (C17459l) arrayList4.get(i15);
                Bundle bundle8 = new Bundle();
                if (c17459l2.f55812b == null && (i10 = c17459l2.f55816f) != 0) {
                    c17459l2.f55812b = IconCompat.m11384b(resources, "", i10);
                }
                IconCompat iconCompat3 = c17459l2.f55812b;
                bundle8.putInt(ParameterNames.ICON, iconCompat3 != null ? iconCompat3.m11385c() : 0);
                bundle8.putCharSequence(UiComponentConfig.Title.type, c17459l2.f55817g);
                bundle8.putParcelable(HpucjswO.tijjWjhYIIBQsPP, c17459l2.f55818h);
                Bundle bundle9 = c17459l2.f55811a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c17459l2.f55814d);
                bundle8.putBundle("extras", bundle10);
                AbstractC17473z[] abstractC17473zArr2 = c17459l2.f55813c;
                if (abstractC17473zArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[abstractC17473zArr2.length];
                    if (abstractC17473zArr2.length > 0) {
                        AbstractC17473z abstractC17473z2 = abstractC17473zArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", c17459l2.f55815e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i15++;
                arrayList4 = arrayList4;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f55837o == null) {
                this.f55837o = new Bundle();
            }
            this.f55837o.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) c11238i.f34011p0).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            ((Notification.Builder) c11238i.f34009Z).setExtras(this.f55837o);
            AbstractC17466s.m19170c((Notification.Builder) c11238i.f34009Z);
        }
        if (i16 >= 26) {
            AbstractC17458k.m19144f((Notification.Builder) c11238i.f34009Z);
            AbstractC17458k.m19149k((Notification.Builder) c11238i.f34009Z);
            AbstractC17458k.m19150l((Notification.Builder) c11238i.f34009Z);
            AbstractC17458k.m19153o((Notification.Builder) c11238i.f34009Z);
            AbstractC17458k.m19147i((Notification.Builder) c11238i.f34009Z);
            if (!TextUtils.isEmpty(this.f55840r)) {
                ((Notification.Builder) c11238i.f34009Z).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw AbstractC3794B0.m4497v(it3);
            }
        }
        if (i16 >= 29) {
            AbstractC17453f.m19133b((Notification.Builder) c11238i.f34009Z, this.f55841s);
            AbstractC17453f.m19134c((Notification.Builder) c11238i.f34009Z);
        }
        C17465r c17465r = (C17465r) c11238i.f34010o0;
        AbstractC3812N abstractC3812N = c17465r.f55835m;
        if (abstractC3812N != null) {
            abstractC3812N.mo4531i(c11238i);
        }
        int i17 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) c11238i.f34009Z;
        if (i17 < 26 && i17 < 24) {
            builder3.setExtras((Bundle) c11238i.f34011p0);
            notificationBuild = builder3.build();
        } else {
            notificationBuild = builder3.build();
        }
        if (abstractC3812N != null) {
            c17465r.f55835m.getClass();
        }
        if (abstractC3812N != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", abstractC3812N.mo4512A());
        }
        return notificationBuild;
    }
}

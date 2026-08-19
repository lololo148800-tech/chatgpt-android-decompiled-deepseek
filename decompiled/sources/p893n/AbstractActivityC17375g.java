package p893n;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.C10820c;
import androidx.appcompat.view.C10825h;
import androidx.appcompat.view.C10827j;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1072w2.C20793e;
import p183H4.C3226a;
import p183H4.C3231f;
import p501Ub.ExecutorC7613o;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p544W9.AbstractC8748z;
import p817j$.util.Objects;
import p896n2.AbstractC17452e;
import p896n2.C17447A;
import p955q2.AbstractC18610b;
import p955q2.AbstractC18616h;
import p999s.AbstractC19344d1;
import p999s.C19330Y0;
import p999s.C19372q;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC17375g extends AbstractActivityC11001b implements InterfaceC17376h {

    /* JADX INFO: renamed from: L0 */
    public LayoutInflaterFactory2C17390v f55483L0;

    public AbstractActivityC17375g() {
        ((C3231f) this.f32064p0.f405p0).m4125f("androidx:appcompat", new C3226a(this));
        m11094k(new C17374f(this));
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m19055r();
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.m19105z();
        ((ViewGroup) layoutInflaterFactory2C17390v.f55538M0.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C17390v.f55574y0.m19082b(layoutInflaterFactory2C17390v.f55573x0.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e1 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:107:0x01c3, B:109:0x01c7, B:115:0x01df, B:116:0x01e1, B:118:0x01e5, B:124:0x01f5, B:123:0x01ec, B:114:0x01d8), top: B:134:0x01c3, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:88:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191  */
    /* JADX WARN: Code duplicated, block: B:97:0x0199  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        C10820c c10820c;
        Resources.Theme theme;
        Method method;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.f55552a1 = true;
        int i47 = layoutInflaterFactory2C17390v.f55556e1;
        if (i47 == -100) {
            i47 = AbstractC17379k.f55485Z;
        }
        int iM19091G = layoutInflaterFactory2C17390v.m19091G(context, i47);
        if (AbstractC17379k.m19061d(context)) {
            AbstractC17379k.m19064n(context);
        }
        C20793e c20793eM19084r = LayoutInflaterFactory2C17390v.m19084r(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C10820c) {
                    try {
                        ((C10820c) context).m11112a(LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C17390v.f55525v1) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    i14 = Build.VERSION.SDK_INT;
                                    if (i14 >= 24) {
                                        AbstractC17383o.m19075a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i15 = configuration.touchscreen;
                                    i16 = configuration2.touchscreen;
                                    if (i15 != i16) {
                                        configuration3.touchscreen = i16;
                                    }
                                    i17 = configuration.keyboard;
                                    i18 = configuration2.keyboard;
                                    if (i17 != i18) {
                                        configuration3.keyboard = i18;
                                    }
                                    i19 = configuration.keyboardHidden;
                                    i20 = configuration2.keyboardHidden;
                                    if (i19 != i20) {
                                        configuration3.keyboardHidden = i20;
                                    }
                                    i21 = configuration.navigation;
                                    i22 = configuration2.navigation;
                                    if (i21 != i22) {
                                        configuration3.navigation = i22;
                                    }
                                    i23 = configuration.navigationHidden;
                                    i24 = configuration2.navigationHidden;
                                    if (i23 != i24) {
                                        configuration3.navigationHidden = i24;
                                    }
                                    i25 = configuration.orientation;
                                    i26 = configuration2.orientation;
                                    if (i25 != i26) {
                                        configuration3.orientation = i26;
                                    }
                                    i27 = configuration.screenLayout & 15;
                                    i28 = configuration2.screenLayout & 15;
                                    if (i27 != i28) {
                                        configuration3.screenLayout |= i28;
                                    }
                                    i29 = configuration.screenLayout & 192;
                                    i30 = configuration2.screenLayout & 192;
                                    if (i29 != i30) {
                                        configuration3.screenLayout |= i30;
                                    }
                                    i31 = configuration.screenLayout & 48;
                                    i32 = configuration2.screenLayout & 48;
                                    if (i31 != i32) {
                                        configuration3.screenLayout |= i32;
                                    }
                                    i33 = configuration.screenLayout & 768;
                                    i34 = configuration2.screenLayout & 768;
                                    if (i33 != i34) {
                                        configuration3.screenLayout |= i34;
                                    }
                                    if (i14 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i35 = configuration.uiMode & 15;
                                    i36 = configuration2.uiMode & 15;
                                    if (i35 != i36) {
                                        configuration3.uiMode |= i36;
                                    }
                                    i37 = configuration.uiMode & 48;
                                    i38 = configuration2.uiMode & 48;
                                    if (i37 != i38) {
                                        configuration3.uiMode |= i38;
                                    }
                                    i39 = configuration.screenWidthDp;
                                    i40 = configuration2.screenWidthDp;
                                    if (i39 != i40) {
                                        configuration3.screenWidthDp = i40;
                                    }
                                    i41 = configuration.screenHeightDp;
                                    i42 = configuration2.screenHeightDp;
                                    if (i41 != i42) {
                                        configuration3.screenHeightDp = i42;
                                    }
                                    i43 = configuration.smallestScreenWidthDp;
                                    i44 = configuration2.smallestScreenWidthDp;
                                    if (i43 != i44) {
                                        configuration3.smallestScreenWidthDp = i44;
                                    }
                                    i45 = configuration.densityDpi;
                                    i46 = configuration2.densityDpi;
                                    if (i45 != i46) {
                                        configuration3.densityDpi = i46;
                                    }
                                }
                            }
                            Configuration configurationM19085v = LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, configuration3, true);
                            c10820c = new C10820c(context, com.openai.chatgpt.R.style.Theme_AppCompat_Empty);
                            c10820c.m11112a(configurationM19085v);
                            try {
                                if (context.getTheme() != null) {
                                    theme = c10820c.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        AbstractC18616h.m19973b(theme);
                                    } else {
                                        synchronized (AbstractC18610b.f59278e) {
                                            if (AbstractC18610b.f59280g) {
                                                method = AbstractC18610b.f59279f;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    AbstractC18610b.f59279f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e10) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                                                }
                                                AbstractC18610b.f59280g = true;
                                                method = AbstractC18610b.f59279f;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e11) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                                        AbstractC18610b.f59279f = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c10820c;
                        }
                    }
                } else if (LayoutInflaterFactory2C17390v.f55525v1) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 24) {
                                AbstractC17383o.m19075a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i15 = configuration.touchscreen;
                            i16 = configuration2.touchscreen;
                            if (i15 != i16) {
                                configuration3.touchscreen = i16;
                            }
                            i17 = configuration.keyboard;
                            i18 = configuration2.keyboard;
                            if (i17 != i18) {
                                configuration3.keyboard = i18;
                            }
                            i19 = configuration.keyboardHidden;
                            i20 = configuration2.keyboardHidden;
                            if (i19 != i20) {
                                configuration3.keyboardHidden = i20;
                            }
                            i21 = configuration.navigation;
                            i22 = configuration2.navigation;
                            if (i21 != i22) {
                                configuration3.navigation = i22;
                            }
                            i23 = configuration.navigationHidden;
                            i24 = configuration2.navigationHidden;
                            if (i23 != i24) {
                                configuration3.navigationHidden = i24;
                            }
                            i25 = configuration.orientation;
                            i26 = configuration2.orientation;
                            if (i25 != i26) {
                                configuration3.orientation = i26;
                            }
                            i27 = configuration.screenLayout & 15;
                            i28 = configuration2.screenLayout & 15;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.screenLayout & 192;
                            i30 = configuration2.screenLayout & 192;
                            if (i29 != i30) {
                                configuration3.screenLayout |= i30;
                            }
                            i31 = configuration.screenLayout & 48;
                            i32 = configuration2.screenLayout & 48;
                            if (i31 != i32) {
                                configuration3.screenLayout |= i32;
                            }
                            i33 = configuration.screenLayout & 768;
                            i34 = configuration2.screenLayout & 768;
                            if (i33 != i34) {
                                configuration3.screenLayout |= i34;
                            }
                            if (i14 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i35 = configuration.uiMode & 15;
                            i36 = configuration2.uiMode & 15;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.uiMode & 48;
                            i38 = configuration2.uiMode & 48;
                            if (i37 != i38) {
                                configuration3.uiMode |= i38;
                            }
                            i39 = configuration.screenWidthDp;
                            i40 = configuration2.screenWidthDp;
                            if (i39 != i40) {
                                configuration3.screenWidthDp = i40;
                            }
                            i41 = configuration.screenHeightDp;
                            i42 = configuration2.screenHeightDp;
                            if (i41 != i42) {
                                configuration3.screenHeightDp = i42;
                            }
                            i43 = configuration.smallestScreenWidthDp;
                            i44 = configuration2.smallestScreenWidthDp;
                            if (i43 != i44) {
                                configuration3.smallestScreenWidthDp = i44;
                            }
                            i45 = configuration.densityDpi;
                            i46 = configuration2.densityDpi;
                            if (i45 != i46) {
                                configuration3.densityDpi = i46;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationM19085v2 = LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, configuration3, true);
                    c10820c = new C10820c(context, com.openai.chatgpt.R.style.Theme_AppCompat_Empty);
                    c10820c.m11112a(configurationM19085v2);
                    if (context.getTheme() != null) {
                        theme = c10820c.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC18616h.m19973b(theme);
                        } else {
                            synchronized (AbstractC18610b.f59278e) {
                                if (AbstractC18610b.f59280g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC18610b.f59279f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    AbstractC18610b.f59280g = true;
                                    method = AbstractC18610b.f59279f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = AbstractC18610b.f59279f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = c10820c;
                }
            }
        } else if (context instanceof C10820c) {
            ((C10820c) context).m11112a(LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, null, false));
        } else if (LayoutInflaterFactory2C17390v.f55525v1) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        AbstractC17383o.m19075a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i15 = configuration.touchscreen;
                    i16 = configuration2.touchscreen;
                    if (i15 != i16) {
                        configuration3.touchscreen = i16;
                    }
                    i17 = configuration.keyboard;
                    i18 = configuration2.keyboard;
                    if (i17 != i18) {
                        configuration3.keyboard = i18;
                    }
                    i19 = configuration.keyboardHidden;
                    i20 = configuration2.keyboardHidden;
                    if (i19 != i20) {
                        configuration3.keyboardHidden = i20;
                    }
                    i21 = configuration.navigation;
                    i22 = configuration2.navigation;
                    if (i21 != i22) {
                        configuration3.navigation = i22;
                    }
                    i23 = configuration.navigationHidden;
                    i24 = configuration2.navigationHidden;
                    if (i23 != i24) {
                        configuration3.navigationHidden = i24;
                    }
                    i25 = configuration.orientation;
                    i26 = configuration2.orientation;
                    if (i25 != i26) {
                        configuration3.orientation = i26;
                    }
                    i27 = configuration.screenLayout & 15;
                    i28 = configuration2.screenLayout & 15;
                    if (i27 != i28) {
                        configuration3.screenLayout |= i28;
                    }
                    i29 = configuration.screenLayout & 192;
                    i30 = configuration2.screenLayout & 192;
                    if (i29 != i30) {
                        configuration3.screenLayout |= i30;
                    }
                    i31 = configuration.screenLayout & 48;
                    i32 = configuration2.screenLayout & 48;
                    if (i31 != i32) {
                        configuration3.screenLayout |= i32;
                    }
                    i33 = configuration.screenLayout & 768;
                    i34 = configuration2.screenLayout & 768;
                    if (i33 != i34) {
                        configuration3.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i35 = configuration.uiMode & 15;
                    i36 = configuration2.uiMode & 15;
                    if (i35 != i36) {
                        configuration3.uiMode |= i36;
                    }
                    i37 = configuration.uiMode & 48;
                    i38 = configuration2.uiMode & 48;
                    if (i37 != i38) {
                        configuration3.uiMode |= i38;
                    }
                    i39 = configuration.screenWidthDp;
                    i40 = configuration2.screenWidthDp;
                    if (i39 != i40) {
                        configuration3.screenWidthDp = i40;
                    }
                    i41 = configuration.screenHeightDp;
                    i42 = configuration2.screenHeightDp;
                    if (i41 != i42) {
                        configuration3.screenHeightDp = i42;
                    }
                    i43 = configuration.smallestScreenWidthDp;
                    i44 = configuration2.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration3.smallestScreenWidthDp = i44;
                    }
                    i45 = configuration.densityDpi;
                    i46 = configuration2.densityDpi;
                    if (i45 != i46) {
                        configuration3.densityDpi = i46;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationM19085v3 = LayoutInflaterFactory2C17390v.m19085v(context, iM19091G, c20793eM19084r, configuration3, true);
            c10820c = new C10820c(context, com.openai.chatgpt.R.style.Theme_AppCompat_Empty);
            c10820c.m11112a(configurationM19085v3);
            if (context.getTheme() != null) {
                theme = c10820c.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC18616h.m19973b(theme);
                } else {
                    synchronized (AbstractC18610b.f59278e) {
                        if (AbstractC18610b.f59280g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            AbstractC18610b.f59279f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            AbstractC18610b.f59280g = true;
                            method = AbstractC18610b.f59279f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = AbstractC18610b.f59279f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = c10820c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        m19054q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p896n2.AbstractActivityC17454g, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m19054q();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.m19105z();
        return layoutInflaterFactory2C17390v.f55573x0.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        if (layoutInflaterFactory2C17390v.f55527B0 == null) {
            layoutInflaterFactory2C17390v.m19089E();
            C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
            layoutInflaterFactory2C17390v.f55527B0 = new C10825h(c17368e != null ? c17368e.m19041c() : layoutInflaterFactory2C17390v.f55572w0);
        }
        return layoutInflaterFactory2C17390v.f55527B0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = AbstractC19344d1.f61274a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        if (layoutInflaterFactory2C17390v.f55526A0 != null) {
            layoutInflaterFactory2C17390v.m19089E();
            layoutInflaterFactory2C17390v.f55526A0.getClass();
            layoutInflaterFactory2C17390v.m19090F(0);
        }
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        if (layoutInflaterFactory2C17390v.f55543R0 && layoutInflaterFactory2C17390v.f55537L0) {
            layoutInflaterFactory2C17390v.m19089E();
            C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
            if (c17368e != null) {
                c17368e.m19044f(c17368e.f55412a.getResources().getBoolean(com.openai.chatgpt.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C19372q c19372qM20473a = C19372q.m20473a();
        Context context = layoutInflaterFactory2C17390v.f55572w0;
        synchronized (c19372qM20473a) {
            c19372qM20473a.f61354a.m20388l(context);
        }
        layoutInflaterFactory2C17390v.f55555d1 = new Configuration(layoutInflaterFactory2C17390v.f55572w0.getResources().getConfiguration());
        layoutInflaterFactory2C17390v.m19098o(false, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m19053p().mo19067f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intentM19128b;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        C17368E c17368eM19054q = m19054q();
        if (menuItem.getItemId() == 16908332 && c17368eM19054q != null && (((C19330Y0) c17368eM19054q.f55416e).f61224b & 4) != 0 && (intentM19128b = AbstractC17452e.m19128b(this)) != null) {
            if (!shouldUpRecreateTask(intentM19128b)) {
                navigateUpTo(intentM19128b);
                return true;
            }
            C17447A c17447a = new C17447A(this);
            Intent intentM19128b2 = AbstractC17452e.m19128b(this);
            if (intentM19128b2 == null) {
                intentM19128b2 = AbstractC17452e.m19128b(this);
            }
            if (intentM19128b2 != null) {
                ComponentName component = intentM19128b2.getComponent();
                if (component == null) {
                    component = intentM19128b2.resolveActivity(c17447a.f55786Z.getPackageManager());
                }
                c17447a.m19124f(component);
                c17447a.f55785Y.add(intentM19128b2);
            }
            c17447a.m19125i();
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C17390v) m19053p()).m19105z();
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e != null) {
            c17368e.f55432u = true;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C17390v) m19053p()).m19098o(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e != null) {
            c17368e.f55432u = false;
            C10827j c10827j = c17368e.f55431t;
            if (c10827j != null) {
                c10827j.m11118a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m19053p().mo19072m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        m19054q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC17379k m19053p() {
        if (this.f55483L0 == null) {
            ExecutorC7613o executorC7613o = AbstractC17379k.f55484Y;
            this.f55483L0 = new LayoutInflaterFactory2C17390v(this, null, this, this);
        }
        return this.f55483L0;
    }

    /* JADX INFO: renamed from: q */
    public final C17368E m19054q() {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19053p();
        layoutInflaterFactory2C17390v.m19089E();
        return layoutInflaterFactory2C17390v.f55526A0;
    }

    /* JADX INFO: renamed from: r */
    public final void m19055r() {
        AbstractC7841A0.m8092d(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m12148b(getWindow().getDecorView(), this);
        AbstractC8104h6.m8585d(getWindow().getDecorView(), this);
        AbstractC8748z.m9503d(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void setContentView(int i10) {
        m19055r();
        m19053p().mo19069i(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((LayoutInflaterFactory2C17390v) m19053p()).f55557f1 = i10;
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public void setContentView(View view) {
        m19055r();
        m19053p().mo19070j(view);
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m19055r();
        m19053p().mo19071k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

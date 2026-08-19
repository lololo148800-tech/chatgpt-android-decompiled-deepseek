package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.openai.chatgpt.R;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: renamed from: androidx.appcompat.view.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10820c extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f32080f;

    /* JADX INFO: renamed from: a */
    public int f32081a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f32082b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f32083c;

    /* JADX INFO: renamed from: d */
    public Configuration f32084d;

    /* JADX INFO: renamed from: e */
    public Resources f32085e;

    public C10820c(Context context, int i10) {
        super(context);
        this.f32081a = i10;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m11113b() {
        if (this.f32082b == null) {
            this.f32082b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f32082b.setTo(theme);
            }
        }
        this.f32082b.applyStyle(this.f32081a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f32085e == null) {
            Configuration configuration = this.f32084d;
            if (configuration == null) {
                this.f32085e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f32080f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f32080f = configuration2;
                    }
                    if (configuration.equals(f32080f)) {
                        this.f32085e = super.getResources();
                    }
                }
                this.f32085e = createConfigurationContext(this.f32084d).getResources();
            }
        }
        return this.f32085e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f32083c == null) {
            this.f32083c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f32083c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f32082b;
        if (theme != null) {
            return theme;
        }
        if (this.f32081a == 0) {
            this.f32081a = R.style.Theme_AppCompat_Light;
        }
        m11113b();
        return this.f32082b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f32081a != i10) {
            this.f32081a = i10;
            m11113b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11112a(Configuration configuration) {
        if (this.f32085e != null) {
            throw new IllegalStateException(tpXhEMGxfXFVSh.iPN);
        }
        if (this.f32084d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f32084d = new Configuration(configuration);
    }
}

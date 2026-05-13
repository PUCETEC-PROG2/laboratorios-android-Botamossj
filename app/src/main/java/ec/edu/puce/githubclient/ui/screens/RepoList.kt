package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(
    modifier: Modifier = Modifier
) {
    Column (
        modifier
    ){
        RepoItem(
            name = "Repositorio de Django",
            description = "Repositorio creado en Python para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://www.google.com/url?sa=t&source=web&rct=j&url=https%3A%2F%2Fwww.datree.io%2Fresources%2Fguide-to-django-middleware&ved=0CBUQjRxqFwoTCLD04KOTt5QDFQAAAAAdAAAAABAF&opi=89978449 ",
            language = "Python"
        )

        RepoItem(
            name = "Repositorio de React",
            description = "Repositorio creado en React para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://www.google.com/url?sa=t&source=web&rct=j&url=https%3A%2F%2Fopensource.fb.com%2Fprojects%2Freact%2F&ved=0CBUQjRxqFwoTCPjXsPySt5QDFQAAAAAdAAAAABAF&opi=89978449",
            language = "Javascrpit"
        )

        RepoItem(
            name = "Repositorio de IOS",
            description = "Repositorio creado en Swift para Desarrollo Móvil paralelo 1471",
            avatarUrl = "https://www.google.com/url?sa=t&source=web&rct=j&url=https%3A%2F%2Fwww.gizchina.com%2Fapple%2Fnew-wallpaper-settings-could-be-coming-to-ios-14&ved=0CBUQjRxqFwoTCNjz7JmTt5QDFQAAAAAdAAAAABAG&opi=89978449",
            language = "Swift"
        )
    }
}